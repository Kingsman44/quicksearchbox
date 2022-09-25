package androidx.navigation;

import android.os.Bundle;
import java.util.List;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69646ac;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.navigation.ae */
/* compiled from: PG */
final class C3806ae extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C69644aa f12279a;

    /* renamed from: b */
    final /* synthetic */ List f12280b;

    /* renamed from: c */
    final /* synthetic */ C69646ac f12281c;

    /* renamed from: d */
    final /* synthetic */ C3807af f12282d;

    /* renamed from: e */
    final /* synthetic */ Bundle f12283e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3806ae(C69644aa aaVar, List list, C69646ac acVar, C3807af afVar, Bundle bundle) {
        super(1);
        this.f12279a = aaVar;
        this.f12280b = list;
        this.f12281c = acVar;
        this.f12282d = afVar;
        this.f12283e = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List list;
        C3892m mVar = (C3892m) obj;
        C69664n.m101061g(mVar, "entry");
        this.f12279a.f186023a = true;
        int indexOf = this.f12280b.indexOf(mVar);
        if (indexOf != -1) {
            int i = indexOf + 1;
            list = this.f12280b.subList(this.f12281c.f186025a, i);
            this.f12281c.f186025a = i;
        } else {
            list = C69496am.f185918a;
        }
        this.f12282d.mo8050j(mVar.f12477b, this.f12283e, mVar, list);
        return C69788q.f186170a;
    }
}
