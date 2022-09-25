package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.content.Context;
import android.util.AttributeSet;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.PlaybackSpeedSelector */
/* compiled from: PG */
public class PlaybackSpeedSelector extends C115634j {

    /* renamed from: g */
    private static final C58485gu f320709g;

    static {
        int round = Math.round(15.0f) + 1;
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < round; i++) {
            e.mo55395g(new C115633i(Float.valueOf((((float) i) * 0.1f) + 0.5f)));
        }
        f320709g = e.mo55394f();
    }

    public PlaybackSpeedSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, f320709g);
    }
}
