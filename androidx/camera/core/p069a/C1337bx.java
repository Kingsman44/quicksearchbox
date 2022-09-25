package androidx.camera.core.p069a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.a.bx */
/* compiled from: PG */
public abstract class C1337bx {

    /* renamed from: a */
    private final Set f3818a = new HashSet();

    /* renamed from: c */
    public abstract C1337bx clone();

    /* renamed from: d */
    public final List mo4213d() {
        return Collections.unmodifiableList(new ArrayList(this.f3818a));
    }

    /* renamed from: e */
    public final void mo4214e(List list) {
        this.f3818a.addAll(list);
    }
}
