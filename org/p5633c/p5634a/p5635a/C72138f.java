package org.p5633c.p5634a.p5635a;

import java.io.Serializable;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72147ae;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.p5636b.C72156ab;
import org.p5633c.p5634a.p5637c.C72195d;
import org.p5633c.p5634a.p5637c.C72197f;
import org.p5633c.p5634a.p5637c.C72199h;

/* renamed from: org.c.a.a.f */
/* compiled from: PG */
public class C72138f extends C72133a implements Serializable, C72147ae {
    private static final long serialVersionUID = -6728882245981L;

    /* renamed from: a */
    public volatile long f191962a;

    /* renamed from: b */
    public volatile C72132a f191963b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C72138f() {
        this(System.currentTimeMillis(), C72156ab.m105788W());
        C72284h hVar = C72285i.f192412b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo63408a(long j, C72132a aVar) {
        return j;
    }

    /* renamed from: mr */
    public final long mo63409mr() {
        return this.f191962a;
    }

    /* renamed from: ms */
    public final C72132a mo63410ms() {
        return this.f191963b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: mt */
    public void mo63411mt(long j) {
        this.f191962a = mo63408a(j, this.f191963b);
    }

    public C72138f(int i, int i2, int i3, int i4, int i5, int i6, int i7, C72132a aVar) {
        this.f191963b = C72285i.m106775c(aVar);
        this.f191962a = mo63408a(this.f191963b.mo63346c(i, i2, i3, i4, i5, i6, i7), this.f191963b);
    }

    public C72138f(long j, C72132a aVar) {
        this.f191963b = C72285i.m106775c(aVar);
        this.f191962a = mo63408a(j, this.f191963b);
    }

    public C72138f(Object obj) {
        Class<?> cls;
        String str;
        C72197f fVar = C72195d.m106217a().f192159a;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        C72199h hVar = (C72199h) fVar.mo63539a(cls);
        if (hVar != null) {
            this.f191963b = C72285i.m106775c(hVar.mo63534f(obj));
            this.f191962a = mo63408a(hVar.mo63529a(obj, (C72132a) null), this.f191963b);
            return;
        }
        if (obj == null) {
            str = "null";
        } else {
            str = obj.getClass().getName();
        }
        throw new IllegalArgumentException("No instant converter found for type: ".concat(String.valueOf(str)));
    }
}
