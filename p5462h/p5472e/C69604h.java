package p5462h.p5472e;

import java.io.File;
import java.util.ArrayDeque;
import p5462h.C69677g;
import p5462h.p5463a.C69519c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.e.h */
/* compiled from: PG */
final class C69604h extends C69519c {

    /* renamed from: b */
    final /* synthetic */ C69606j f186008b;

    /* renamed from: c */
    private final ArrayDeque f186009c;

    public C69604h(C69606j jVar) {
        this.f186008b = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f186009c = arrayDeque;
        if (jVar.f186011a.isDirectory()) {
            arrayDeque.push(m101018c(jVar.f186011a));
        } else if (jVar.f186011a.isFile()) {
            arrayDeque.push(new C69602f(jVar.f186011a));
        } else {
            this.f185935a = 3;
        }
    }

    /* renamed from: c */
    private final C69600d m101018c(File file) {
        C69607k kVar = this.f186008b.f186012b;
        C69607k kVar2 = C69607k.TOP_DOWN;
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            return new C69603g(file);
        }
        if (ordinal == 1) {
            return new C69601e(file);
        }
        throw new C69677g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61268a() {
        File file;
        File a;
        while (true) {
            C69605i iVar = (C69605i) this.f186009c.peek();
            if (iVar == null) {
                file = null;
                break;
            }
            a = iVar.mo61363a();
            if (a == null) {
                this.f186009c.pop();
            } else if (C69664n.m101066l(a, iVar.f186010a) || !a.isDirectory() || this.f186009c.size() >= Integer.MAX_VALUE) {
                file = a;
            } else {
                this.f186009c.push(m101018c(a));
            }
        }
        file = a;
        if (file != null) {
            mo61269b(file);
        } else {
            this.f185935a = 3;
        }
    }
}
