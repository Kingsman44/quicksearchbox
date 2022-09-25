package com.google.common.p4522b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.kl */
/* compiled from: PG */
public final class C58584kl extends C58316an implements Serializable, C58585km {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public transient C58581ki f156275a;

    /* renamed from: b */
    public transient C58581ki f156276b;

    /* renamed from: d */
    public transient Map f156277d;

    /* renamed from: e */
    public transient int f156278e;

    /* renamed from: f */
    public transient int f156279f;

    public C58584kl() {
        this(12);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f156277d = new C58388de((byte[]) null);
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            mo55583a(objectInputStream.readObject(), objectInputStream.readObject(), (C58581ki) null);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f156278e);
        for (Map.Entry entry : (List) super.mo54948A()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: A */
    public final /* synthetic */ Collection mo54948A() {
        return (List) super.mo54948A();
    }

    /* renamed from: B */
    public final /* synthetic */ Collection mo54949B() {
        return (List) super.mo54949B();
    }

    /* renamed from: G */
    public final boolean mo54954G() {
        return this.f156275a == null;
    }

    /* renamed from: J */
    public final /* bridge */ /* synthetic */ void mo54957J(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: a */
    public final C58581ki mo55583a(Object obj, Object obj2, C58581ki kiVar) {
        C58581ki kiVar2 = new C58581ki(obj, obj2);
        if (this.f156275a == null) {
            this.f156276b = kiVar2;
            this.f156275a = kiVar2;
            this.f156277d.put(obj, new C58580kh(kiVar2));
            this.f156279f++;
        } else if (kiVar == null) {
            ((C58581ki) Objects.requireNonNull(this.f156276b)).f156259c = kiVar2;
            kiVar2.f156260d = this.f156276b;
            this.f156276b = kiVar2;
            C58580kh khVar = (C58580kh) this.f156277d.get(obj);
            if (khVar == null) {
                this.f156277d.put(obj, new C58580kh(kiVar2));
                this.f156279f++;
            } else {
                khVar.f156256c++;
                C58581ki kiVar3 = khVar.f156255b;
                kiVar3.f156261e = kiVar2;
                kiVar2.f156262f = kiVar3;
                khVar.f156255b = kiVar2;
            }
        } else {
            C58580kh khVar2 = (C58580kh) Objects.requireNonNull((C58580kh) this.f156277d.get(obj));
            khVar2.f156256c++;
            kiVar2.f156260d = kiVar.f156260d;
            kiVar2.f156262f = kiVar.f156262f;
            kiVar2.f156259c = kiVar;
            kiVar2.f156261e = kiVar;
            C58581ki kiVar4 = kiVar.f156262f;
            if (kiVar4 == null) {
                khVar2.f156254a = kiVar2;
            } else {
                kiVar4.f156261e = kiVar2;
            }
            C58581ki kiVar5 = kiVar.f156260d;
            if (kiVar5 == null) {
                this.f156275a = kiVar2;
            } else {
                kiVar5.f156259c = kiVar2;
            }
            kiVar.f156260d = kiVar2;
            kiVar.f156262f = kiVar2;
        }
        this.f156278e++;
        return kiVar2;
    }

    /* renamed from: b */
    public final List mo55584b() {
        return (List) super.mo54948A();
    }

    /* renamed from: c */
    public final /* synthetic */ Collection mo54902c(Object obj) {
        return new C58574kb(this, obj);
    }

    /* renamed from: d */
    public final List mo55585d(Object obj) {
        C58583kk kkVar = new C58583kk(this, obj);
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, kkVar);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    public final List mo55586e() {
        return (List) super.mo54949B();
    }

    /* renamed from: f */
    public final void mo55587f(Object obj) {
        C58570jy.m90162n(new C58583kk(this, obj));
    }

    /* renamed from: g */
    public final List mo55277g(Object obj) {
        return new C58574kb(this, obj);
    }

    /* renamed from: h */
    public final List mo55278h(Object obj) {
        throw null;
    }

    /* renamed from: i */
    public final List mo55279i(Object obj, Iterable iterable) {
        List d = mo55585d(obj);
        C58583kk kkVar = new C58583kk(this, obj);
        Iterator it = iterable.iterator();
        while (kkVar.hasNext() && it.hasNext()) {
            kkVar.next();
            kkVar.set(it.next());
        }
        while (kkVar.hasNext()) {
            kkVar.next();
            kkVar.remove();
        }
        while (it.hasNext()) {
            kkVar.add(it.next());
        }
        return d;
    }

    /* renamed from: j */
    public final int mo54906j() {
        return this.f156278e;
    }

    /* renamed from: k */
    public final C58692ol mo54907k() {
        throw null;
    }

    /* renamed from: l */
    public final /* synthetic */ Collection mo54908l() {
        return new C58575kc(this);
    }

    /* renamed from: m */
    public final /* synthetic */ Collection mo54909m() {
        return new C58578kf(this);
    }

    /* renamed from: n */
    public final Iterator mo54910n() {
        throw null;
    }

    /* renamed from: p */
    public final void mo55588p(C58581ki kiVar) {
        C58581ki kiVar2 = kiVar.f156260d;
        if (kiVar2 != null) {
            kiVar2.f156259c = kiVar.f156259c;
        } else {
            this.f156275a = kiVar.f156259c;
        }
        C58581ki kiVar3 = kiVar.f156259c;
        if (kiVar3 != null) {
            kiVar3.f156260d = kiVar2;
        } else {
            this.f156276b = kiVar2;
        }
        if (kiVar.f156262f == null && kiVar.f156261e == null) {
            ((C58580kh) Objects.requireNonNull((C58580kh) this.f156277d.remove(kiVar.f156257a))).f156256c = 0;
            this.f156279f++;
        } else {
            C58580kh khVar = (C58580kh) Objects.requireNonNull((C58580kh) this.f156277d.get(kiVar.f156257a));
            khVar.f156256c--;
            C58581ki kiVar4 = kiVar.f156262f;
            if (kiVar4 == null) {
                khVar.f156254a = (C58581ki) Objects.requireNonNull(kiVar.f156261e);
            } else {
                kiVar4.f156261e = kiVar.f156261e;
            }
            C58581ki kiVar5 = kiVar.f156261e;
            if (kiVar5 == null) {
                khVar.f156255b = (C58581ki) Objects.requireNonNull(kiVar.f156262f);
            } else {
                kiVar5.f156262f = kiVar.f156262f;
            }
        }
        this.f156278e--;
    }

    /* renamed from: q */
    public final Map mo54913q() {
        return new C58683oc(this);
    }

    /* renamed from: s */
    public final Set mo54915s() {
        return new C58576kd(this);
    }

    /* renamed from: u */
    public final void mo54917u() {
        this.f156275a = null;
        this.f156276b = null;
        this.f156277d.clear();
        this.f156278e = 0;
        this.f156279f++;
    }

    /* renamed from: w */
    public final boolean mo54919w(Object obj) {
        return this.f156277d.containsKey(obj);
    }

    /* renamed from: x */
    public final boolean mo54920x(Object obj, Object obj2) {
        mo55583a(obj, obj2, (C58581ki) null);
        return true;
    }

    public C58584kl(int i) {
        this.f156277d = new C58384da(i);
    }

    public C58584kl(C58671nr nrVar) {
        this(nrVar.mo54951D().size());
        mo54955H(nrVar);
    }
}
