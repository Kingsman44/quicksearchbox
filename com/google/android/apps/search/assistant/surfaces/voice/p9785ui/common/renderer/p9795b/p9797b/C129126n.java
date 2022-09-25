package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.assistant.p3897e.p3921j.aeo;
import com.google.assistant.p3897e.p3921j.afd;
import com.google.assistant.p3897e.p3921j.aff;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.n */
/* compiled from: PG */
final class C129126n {

    /* renamed from: a */
    public static final C59071e f354725a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.n");

    /* renamed from: b */
    public int f354726b = -1;

    /* renamed from: c */
    public int f354727c = 1;

    /* renamed from: a */
    public final int mo108856a() {
        int i = this.f354727c;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                z = true;
            } else {
                i = 2;
            }
        }
        String a = C129125m.m210766a(i);
        if (i != 0) {
            C58838bb.m90887v(z, "#getFocusedCardIndex is called when state machine is in invalid state %s", a);
            return this.f354726b;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo108857b(afd afd) {
        aff aff;
        aeo aeo;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        int i = this.f354727c;
        String a = C129125m.m210766a(i);
        if (i != 0) {
            objArr[0] = a;
            objArr[1] = Integer.valueOf(this.f354726b);
            StringBuilder sb = new StringBuilder(String.format(locale, "Transition failed [current state = %s, index = %d]. ", objArr));
            if (afd.f134992a == 3) {
                sb.append("Has ShowCarouselArgs. ");
            }
            if (afd.f134992a == 1) {
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[1];
                if (afd.f134992a == 1) {
                    aeo = (aeo) afd.f134993b;
                } else {
                    aeo = aeo.f134942d;
                }
                objArr2[0] = Integer.valueOf(aeo.f134945b);
                sb.append(String.format(locale2, "Has EditableCardArgs(index = %d)", objArr2));
            }
            if (afd.f134992a == 2) {
                Locale locale3 = Locale.US;
                Object[] objArr3 = new Object[1];
                if (afd.f134992a == 2) {
                    aff = (aff) afd.f134993b;
                } else {
                    aff = aff.f134995c;
                }
                objArr3[0] = Integer.valueOf(aff.f134998b);
                sb.append(String.format(locale3, "Has ReadOnlyCardArgs(index = %d)", objArr3));
            }
            C59104x c = f354725a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReadNotiStateMachine");
            C59052c cVar = (C59052c) c;
            cVar.mo56380ai(C58979ad.SMALL);
            ((C59052c) cVar.mo56372aa(38219)).mo56385o(sb);
            this.f354727c = 2;
            return;
        }
        throw null;
    }
}
