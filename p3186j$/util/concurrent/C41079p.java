package p3186j$.util.concurrent;

/* renamed from: j$.util.concurrent.p */
class C41079p {

    /* renamed from: a */
    C41074k[] f107613a;

    /* renamed from: b */
    C41074k f107614b = null;

    /* renamed from: c */
    C41078o f107615c;

    /* renamed from: d */
    C41078o f107616d;

    /* renamed from: e */
    int f107617e;

    /* renamed from: f */
    int f107618f;

    /* renamed from: g */
    int f107619g;

    /* renamed from: h */
    final int f107620h;

    C41079p(C41074k[] kVarArr, int i, int i2, int i3) {
        this.f107613a = kVarArr;
        this.f107620h = i;
        this.f107617e = i2;
        this.f107618f = i2;
        this.f107619g = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C41074k mo43572c() {
        C41074k kVar;
        C41074k[] kVarArr;
        int length;
        int i;
        C41078o oVar;
        C41074k kVar2 = this.f107614b;
        if (kVar2 != null) {
            kVar2 = kVar2.f107608d;
        }
        while (kVar == null) {
            if (this.f107618f >= this.f107619g || (kVarArr = this.f107613a) == null || (length = kVarArr.length) <= (i = this.f107617e) || i < 0) {
                this.f107614b = null;
                return null;
            }
            C41074k l = ConcurrentHashMap.m71681l(kVarArr, i);
            if (l == null || l.f107605a >= 0) {
                kVar = l;
            } else if (l instanceof C41070g) {
                this.f107613a = ((C41070g) l).f107598e;
                C41078o oVar2 = this.f107616d;
                if (oVar2 != null) {
                    this.f107616d = oVar2.f107612d;
                } else {
                    oVar2 = new C41078o();
                }
                oVar2.f107611c = kVarArr;
                oVar2.f107609a = length;
                oVar2.f107610b = i;
                oVar2.f107612d = this.f107615c;
                this.f107615c = oVar2;
                kVar = null;
            } else if (l instanceof C41080q) {
                kVar = ((C41080q) l).f107624f;
            } else {
                kVar = null;
            }
            if (this.f107615c != null) {
                while (true) {
                    oVar = this.f107615c;
                    if (oVar == null) {
                        break;
                    }
                    int i2 = this.f107617e;
                    int i3 = oVar.f107609a;
                    int i4 = i2 + i3;
                    this.f107617e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f107617e = oVar.f107610b;
                    this.f107613a = oVar.f107611c;
                    oVar.f107611c = null;
                    C41078o oVar3 = oVar.f107612d;
                    oVar.f107612d = this.f107616d;
                    this.f107615c = oVar3;
                    this.f107616d = oVar;
                    length = i3;
                }
                if (oVar == null) {
                    int i5 = this.f107617e + this.f107620h;
                    this.f107617e = i5;
                    if (i5 >= length) {
                        int i6 = this.f107618f + 1;
                        this.f107618f = i6;
                        this.f107617e = i6;
                    }
                }
            } else {
                int i7 = i + this.f107620h;
                this.f107617e = i7;
                if (i7 >= length) {
                    int i8 = this.f107618f + 1;
                    this.f107618f = i8;
                    this.f107617e = i8;
                }
            }
        }
        this.f107614b = kVar;
        return kVar;
    }
}
