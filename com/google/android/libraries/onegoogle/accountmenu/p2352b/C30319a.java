package com.google.android.libraries.onegoogle.accountmenu.p2352b;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.actions.C30805f;
import com.google.android.libraries.onegoogle.actions.C30809j;
import com.google.android.material.chip.Chip;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.b.a */
/* compiled from: PG */
public final class C30319a {
    /* renamed from: a */
    public static void m56482a(FrameLayout frameLayout, C30809j jVar, String str) {
        LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.action_highlight_chip, frameLayout);
        Chip chip = (Chip) frameLayout.getChildAt(0);
        C30805f fVar = (C30805f) jVar;
        chip.mo47684o(ColorStateList.valueOf(fVar.f83127b));
        chip.setTextColor(fVar.f83128c);
        chip.setText(str);
    }
}
