/*
 * Yalp Store
 * Copyright (C) 2018 Sergey Yeriomin <yeriomin@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.github.yeriomin.yalpstore.view;

import android.support.design.widget.FloatingActionButton;
import android.view.View;

import com.github.yeriomin.yalpstore.R;
import com.github.yeriomin.yalpstore.UpdatableAppsActivity;

public class UpdatableAppsButtonAdapter extends UpdatableAppsButtonAdapterAbstract {

    public UpdatableAppsButtonAdapter(View button) {
        super(button);
    }

    @Override
    public UpdatableAppsButtonAdapterAbstract init(UpdatableAppsActivity activity) {
        ((FloatingActionButton) button).setImageResource(R.drawable.ic_download);
        return super.init(activity);
    }
}
