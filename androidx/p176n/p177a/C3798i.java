package androidx.p176n.p177a;

import android.support.p033v7.widget.LinearLayoutManager;
import android.util.SparseBooleanArray;
import androidx.p060c.C0984n;
import java.util.List;

/* renamed from: androidx.n.a.i */
/* compiled from: PG */
public final class C3798i {

    /* renamed from: f */
    static final C3793d f12247f = new C3793d();

    /* renamed from: a */
    public final List f12248a;

    /* renamed from: b */
    public final List f12249b;

    /* renamed from: c */
    public final C0984n f12250c;

    /* renamed from: d */
    public final SparseBooleanArray f12251d = new SparseBooleanArray();

    /* renamed from: e */
    public final C3797h f12252e;

    public C3798i(List list, List list2) {
        this.f12248a = list;
        this.f12249b = list2;
        this.f12250c = new C0984n(0);
        int size = list.size();
        int i = LinearLayoutManager.INVALID_OFFSET;
        C3797h hVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C3797h hVar2 = (C3797h) this.f12248a.get(i2);
            int i3 = hVar2.f12239b;
            hVar = i3 > i ? hVar2 : hVar;
            if (i3 > i) {
                i = i3;
            }
        }
        this.f12252e = hVar;
    }

    /* renamed from: a */
    public final int mo8030a(C3799j jVar, int i) {
        C3797h b = mo8031b(jVar);
        return b != null ? b.f12238a : i;
    }

    /* renamed from: b */
    public final C3797h mo8031b(C3799j jVar) {
        return (C3797h) this.f12250c.get(jVar);
    }
}
