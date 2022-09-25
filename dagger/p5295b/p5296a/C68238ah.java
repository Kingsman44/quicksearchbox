package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dagger.b.a.ah */
/* compiled from: PG */
public final class C68238ah extends C68246g {

    /* renamed from: a */
    private final List f184597a;

    /* renamed from: c */
    private final List f184598c;

    public C68238ah(List list, List list2) {
        this.f184597a = list;
        this.f184598c = list2;
    }

    /* renamed from: gp */
    public final C60870cx mo60301gp() {
        ArrayList arrayList = new ArrayList(this.f184597a.size() + this.f184598c.size());
        for (C68283d gq : this.f184597a) {
            C60870cx gq2 = gq.mo60297gq();
            gq2.getClass();
            arrayList.add(C68236af.m98546a(C68236af.m98547b(gq2)));
        }
        for (C68283d gq3 : this.f184598c) {
            C60870cx gq4 = gq3.mo60297gq();
            gq4.getClass();
            arrayList.add(C68236af.m98546a(gq4));
        }
        return C60922j.m93044g(C60856cj.m92896e(arrayList), new C68237ag(), C60826bg.f164896a);
    }
}
