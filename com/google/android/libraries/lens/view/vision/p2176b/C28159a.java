package com.google.android.libraries.lens.view.vision.p2176b;

import android.util.Size;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26645f;
import com.google.android.libraries.lens.view.p2173u.C28096b;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28146a;
import com.google.android.libraries.lens.view.vision.C28169k;
import com.google.android.libraries.lens.view.vision.C28174p;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.lens.view.vision.C28182x;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import java.nio.ByteBuffer;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.vision.b.a */
/* compiled from: PG */
public final class C28159a extends C28146a {

    /* renamed from: f */
    private final C21370a f76616f;

    /* renamed from: g */
    private C58833ax f76617g = C58836b.f156633a;

    public C28159a(C28182x xVar, Set set, C21370a aVar) {
        super(xVar, set);
        this.f76616f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C26645f mo33580a() {
        return C26645f.m49231d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo33592m() {
        return 5;
    }

    /* renamed from: n */
    public final C28179u mo33598n(C28179u uVar, long j) {
        return uVar;
    }

    /* renamed from: o */
    public final C28179u mo33599o(C28179u uVar) {
        return uVar;
    }

    /* renamed from: p */
    public final C58833ax mo33600p() {
        return this.f76617g;
    }

    /* renamed from: q */
    public final void mo33601q(C28179u uVar) {
    }

    /* renamed from: r */
    public final void mo33602r(C58485gu guVar) {
    }

    /* renamed from: s */
    public final void mo33603s(C28174p pVar) {
        mo33587h();
    }

    /* renamed from: t */
    public final void mo33604t() {
        mo33588i();
    }

    /* renamed from: u */
    public final void mo33605u(int i) {
    }

    /* renamed from: v */
    public final void mo33606v(ByteBuffer byteBuffer, int i, Size size, int i2, C28097c cVar) {
        long e = this.f76616f.mo26873e();
        this.f76617g = C58833ax.m90834k(Long.valueOf(cVar.f76484b));
        cVar.mo33562e(C28096b.TRACKED);
        cVar.f76493k = C58495hd.m89898l(C58729pv.f156485a);
        cVar.f76494l = C58528ij.m90006F(C58733pz.f156496a);
        cVar.f76492j = 0;
        if (this.f76573a.get() != null) {
            ((C28169k) this.f76573a.get()).mo32199a(cVar);
        }
        this.f76574b.mo33699a(this.f76616f.mo26873e() - e);
        mo33589j(cVar);
    }

    /* renamed from: w */
    public final void mo33607w() {
    }

    /* renamed from: x */
    public final void mo33608x() {
    }

    /* renamed from: y */
    public final void mo33609y() {
    }
}
