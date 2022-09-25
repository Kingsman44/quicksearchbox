package androidx.constraintlayout.p079a.p082b.p083a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.constraintlayout.a.b.a.g */
/* compiled from: PG */
public class C1622g implements C1620e {

    /* renamed from: a */
    public C1620e f4509a = null;

    /* renamed from: b */
    public boolean f4510b = false;

    /* renamed from: c */
    public boolean f4511c = false;

    /* renamed from: d */
    final C1633r f4512d;

    /* renamed from: e */
    int f4513e;

    /* renamed from: f */
    public int f4514f;

    /* renamed from: g */
    int f4515g = 1;

    /* renamed from: h */
    C1623h f4516h = null;

    /* renamed from: i */
    public boolean f4517i = false;

    /* renamed from: j */
    final List f4518j = new ArrayList();

    /* renamed from: k */
    final List f4519k = new ArrayList();

    /* renamed from: l */
    int f4520l = 1;

    public C1622g(C1633r rVar) {
        this.f4512d = rVar;
    }

    /* renamed from: a */
    public final void mo4582a(C1620e eVar) {
        this.f4518j.add(eVar);
        if (this.f4517i) {
            eVar.mo4575f();
        }
    }

    /* renamed from: b */
    public final void mo4583b() {
        this.f4519k.clear();
        this.f4518j.clear();
        this.f4517i = false;
        this.f4514f = 0;
        this.f4511c = false;
        this.f4510b = false;
    }

    /* renamed from: c */
    public void mo4584c(int i) {
        if (!this.f4517i) {
            this.f4517i = true;
            this.f4514f = i;
            for (C1620e f : this.f4518j) {
                f.mo4575f();
            }
        }
    }

    /* renamed from: f */
    public final void mo4575f() {
        for (C1622g gVar : this.f4519k) {
            if (!gVar.f4517i) {
                return;
            }
        }
        this.f4511c = true;
        C1620e eVar = this.f4509a;
        if (eVar != null) {
            eVar.mo4575f();
        }
        if (this.f4510b) {
            this.f4512d.mo4575f();
            return;
        }
        C1622g gVar2 = null;
        int i = 0;
        for (C1622g gVar3 : this.f4519k) {
            if (!(gVar3 instanceof C1623h)) {
                i++;
                gVar2 = gVar3;
            }
        }
        if (gVar2 != null && i == 1 && gVar2.f4517i) {
            C1623h hVar = this.f4516h;
            if (hVar != null) {
                if (hVar.f4517i) {
                    this.f4513e = this.f4515g * hVar.f4514f;
                } else {
                    return;
                }
            }
            mo4584c(gVar2.f4514f + this.f4513e);
        }
        C1620e eVar2 = this.f4509a;
        if (eVar2 != null) {
            eVar2.mo4575f();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.f4512d.f4538d.f4638ar;
        switch (this.f4520l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String obj = (this.f4517i ? Integer.valueOf(this.f4514f) : "unresolved").toString();
        int size = this.f4519k.size();
        int size2 = this.f4518j.size();
        return str2 + ":" + str + "(" + obj + ") <t=" + size + ":d=" + size2 + ">";
    }
}
