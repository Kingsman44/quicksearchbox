package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.MediaPlayerPlaybackSpeedSelector */
/* compiled from: PG */
public class MediaPlayerPlaybackSpeedSelector extends C115647w {

    /* renamed from: g */
    private static final C59071e f320708g = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.MediaPlayerPlaybackSpeedSelector");

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaPlayerPlaybackSpeedSelector(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            r0 = 3
            int[] r0 = new int[r0]
            r0 = {2130970547, 2130970594, 2130971114} // fill-array
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r0)
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1
            float r1 = r0.getFloat(r2, r1)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            float r3 = r0.getFloat(r4, r3)
            r5 = 2
            r6 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = r0.getFloat(r5, r6)
            r0.recycle()
            float r3 = r3 - r1
            float r3 = r3 / r5
            int r0 = java.lang.Math.round(r3)
            int r0 = r0 + r2
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
        L_0x002e:
            if (r4 >= r0) goto L_0x003f
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.v r3 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.v
            float r6 = (float) r4
            float r6 = r6 * r5
            float r6 = r6 + r1
            r3.<init>(r6)
            r2.mo55395g(r3)
            int r4 = r4 + 1
            goto L_0x002e
        L_0x003f:
            com.google.common.b.gu r0 = r2.mo55394f()
            r7.<init>(r8, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.MediaPlayerPlaybackSpeedSelector.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: a */
    public final void mo102126a(float f) {
        C115646v vVar = new C115646v(f);
        if (!this.f320824d.contains(vVar)) {
            C59104x d = f320708g.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MediaPlayerPlaybackSS");
            ((C59052c) ((C59052c) d).mo56372aa(29981)).mo56391u("Invalid media player speed, speed: %f, simpleFloatValue: %f", f, vVar.mo102171a());
            C58485gu guVar = this.f320824d;
            int size = guVar.size();
            float f2 = Float.MAX_VALUE;
            C115646v vVar2 = vVar;
            for (int i = 0; i < size; i++) {
                C115646v vVar3 = (C115646v) guVar.get(i);
                float abs = Math.abs(vVar3.mo102171a().floatValue() - vVar.mo102171a().floatValue());
                if (abs < f2) {
                    vVar2 = vVar3;
                }
                if (abs < f2) {
                    f2 = abs;
                }
            }
            vVar = vVar2;
        }
        mo102176c(vVar);
    }
}
