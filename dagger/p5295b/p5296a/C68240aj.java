package dagger.p5295b.p5296a;

import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.C68285f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dagger.b.a.aj */
/* compiled from: PG */
public final class C68240aj extends C68246g {

    /* renamed from: a */
    public static final C68283d f184599a = C68285f.m98628a(C58733pz.f156496a);

    /* renamed from: c */
    private final List f184600c;

    /* renamed from: d */
    private final List f184601d;

    public C68240aj(List list, List list2) {
        this.f184600c = list;
        this.f184601d = list2;
    }

    /* renamed from: gp */
    public final C60870cx mo60301gp() {
        ArrayList arrayList = new ArrayList(this.f184600c.size());
        for (C68283d gq : this.f184600c) {
            C60870cx gq2 = gq.mo60297gq();
            gq2.getClass();
            arrayList.add(gq2);
        }
        ArrayList arrayList2 = new ArrayList(this.f184601d.size() + 1);
        arrayList2.add(C60856cj.m92896e(arrayList));
        for (C68283d gq3 : this.f184601d) {
            C60870cx gq4 = gq3.mo60297gq();
            gq4.getClass();
            arrayList2.add(gq4);
        }
        return C60922j.m93044g(C60856cj.m92896e(arrayList2), new C68239ai(), C60826bg.f164896a);
    }
}
