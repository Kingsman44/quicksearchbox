package androidx.camera.core.p069a;

import android.hardware.camera2.params.InputConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.a.cq */
/* compiled from: PG */
public final class C1357cq {

    /* renamed from: a */
    public final List f3842a;

    /* renamed from: b */
    public final List f3843b;

    /* renamed from: c */
    public final List f3844c;

    /* renamed from: d */
    public final List f3845d;

    /* renamed from: e */
    public final List f3846e;

    /* renamed from: f */
    public final C1302ap f3847f;

    /* renamed from: g */
    public final InputConfiguration f3848g;

    public C1357cq(List list, List list2, List list3, List list4, List list5, C1302ap apVar, InputConfiguration inputConfiguration) {
        this.f3842a = list;
        this.f3843b = Collections.unmodifiableList(list2);
        this.f3844c = Collections.unmodifiableList(list3);
        this.f3845d = Collections.unmodifiableList(list4);
        this.f3846e = Collections.unmodifiableList(list5);
        this.f3847f = apVar;
        this.f3848g = inputConfiguration;
    }

    /* renamed from: a */
    public static C1357cq m3705a() {
        return new C1357cq(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C1300an().mo4157a(), (InputConfiguration) null);
    }

    /* renamed from: b */
    public final List mo4242b() {
        ArrayList arrayList = new ArrayList();
        for (C1355co coVar : this.f3842a) {
            arrayList.add(coVar.mo4236b());
            for (C1314ba add : coVar.mo4238d()) {
                arrayList.add(add);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
