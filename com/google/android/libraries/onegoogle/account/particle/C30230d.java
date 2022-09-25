package com.google.android.libraries.onegoogle.account.particle;

import android.widget.TextView;
import androidx.constraintlayout.widget.C1745d;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2346b.C30165b;
import com.google.android.libraries.onegoogle.account.p2346b.C30166c;
import com.google.android.libraries.onegoogle.common.C30924k;
import com.google.android.libraries.p1623at.p1632e.C19555c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4524d.C58952a;

/* renamed from: com.google.android.libraries.onegoogle.account.particle.d */
/* compiled from: PG */
public final class C30230d {

    /* renamed from: a */
    public final TextView f81723a;

    /* renamed from: b */
    private final TextView f81724b;

    /* renamed from: c */
    private final TextView f81725c;

    /* renamed from: d */
    private final AccountParticleDisc f81726d;

    /* renamed from: e */
    private final C30158c f81727e;

    /* renamed from: f */
    private final C58833ax f81728f;

    public C30230d(C30231e eVar, C30158c cVar, C58833ax axVar) {
        this.f81726d = eVar.mo35701f();
        this.f81724b = eVar.mo35699c();
        this.f81725c = eVar.mo35700e();
        this.f81723a = eVar.mo35698a();
        cVar.getClass();
        this.f81727e = cVar;
        this.f81728f = axVar;
    }

    /* renamed from: b */
    private static String m56171b(String str) {
        return str.replace('-', 8209);
    }

    /* renamed from: c */
    private static String m56172c(String str) {
        if (str != null) {
            return C58837ba.m90856e(str.trim());
        }
        return null;
    }

    /* renamed from: a */
    public final void mo35703a(Object obj, C30229c cVar) {
        boolean z;
        String c = m56172c(this.f81727e.mo35555f(obj));
        String c2 = m56172c(this.f81727e.mo35553d(obj));
        C58833ax axVar = (C58833ax) this.f81728f.mo56106b(C30227a.f81721a).mo56109e(C58836b.f156633a);
        String str = null;
        if (axVar.mo56113h()) {
            C30166c cVar2 = (C30166c) axVar.mo56107c();
            C30158c cVar3 = this.f81727e;
            C58952a aVar = new C58952a(cVar3.mo35553d(obj));
            if (aVar.f156807c && ((aVar.f156805a.startsWith("/seed/") || aVar.f156806b.equals("glimitedaccount.com")) && cVar3.mo35558i(obj))) {
                z = true;
            } else {
                z = false;
            }
            if (new C30165b(z).f81537a) {
                c2 = null;
            }
        }
        if (c == null) {
            c = c2;
        }
        if (true != C19555c.m37297b(c, c2)) {
            str = c2;
        }
        c.getClass();
        String b = m56171b(c);
        this.f81724b.setText(b);
        if (str != null) {
            String b2 = m56171b(str);
            C2043bi.m5551ae(this.f81725c, 2);
            b = b + "\n" + b2;
            this.f81725c.setText(b2);
            this.f81725c.setVisibility(0);
        } else {
            this.f81725c.setVisibility(8);
        }
        if (this.f81723a != null) {
            float f = this.f81725c.getVisibility() == 8 ? 0.5f : 1.0f;
            C58833ax axVar2 = this.f81728f;
            if (!axVar2.mo56113h() || !((C30233g) axVar2.mo56107c()).mo35709d().mo56113h()) {
                this.f81723a.setVisibility(8);
            } else {
                C30924k a = ((C30237k) ((C30233g) axVar2.mo56107c()).mo35709d().mo56107c()).mo35722a();
                C30228b bVar = new C30228b(a);
                C1745d dVar = (C1745d) this.f81723a.getLayoutParams();
                dVar.f5237F = f;
                this.f81723a.setLayoutParams(dVar);
                C2391v a2 = ((C30233g) axVar2.mo56107c()).mo35706a();
                a.mo36605a().mo5707k(a2);
                a.mo36605a().mo5704e(a2, bVar);
            }
        }
        String a3 = cVar.mo35702a(b);
        this.f81726d.mo35592j(obj);
        String f2 = this.f81726d.mo35588f();
        if (f2 != null) {
            a3 = a3 + "\n" + f2;
        }
        this.f81724b.setContentDescription(a3);
    }
}
