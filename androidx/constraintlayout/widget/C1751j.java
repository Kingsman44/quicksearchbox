package androidx.constraintlayout.widget;

import java.util.HashMap;

/* renamed from: androidx.constraintlayout.widget.j */
/* compiled from: PG */
public final class C1751j {

    /* renamed from: a */
    public int f5338a;

    /* renamed from: b */
    public String f5339b;

    /* renamed from: c */
    public final C1754m f5340c = new C1754m();

    /* renamed from: d */
    public final C1753l f5341d = new C1753l();

    /* renamed from: e */
    public final C1752k f5342e = new C1752k();

    /* renamed from: f */
    public final C1755n f5343f = new C1755n();

    /* renamed from: g */
    public HashMap f5344g = new HashMap();

    /* renamed from: h */
    public C1750i f5345h;

    /* renamed from: a */
    public final C1751j clone() {
        C1751j jVar = new C1751j();
        jVar.f5342e.mo4878a(this.f5342e);
        jVar.f5341d.mo4879a(this.f5341d);
        jVar.f5340c.mo4880a(this.f5340c);
        jVar.f5343f.mo4881a(this.f5343f);
        jVar.f5338a = this.f5338a;
        jVar.f5345h = this.f5345h;
        return jVar;
    }

    /* renamed from: b */
    public final void mo4874b(C1751j jVar) {
        C1750i iVar = this.f5345h;
        if (iVar != null) {
            iVar.mo4872e(jVar);
        }
    }

    /* renamed from: c */
    public final void mo4875c(C1745d dVar) {
        C1752k kVar = this.f5342e;
        dVar.f5281e = kVar.f5398j;
        dVar.f5282f = kVar.f5399k;
        dVar.f5283g = kVar.f5400l;
        dVar.f5284h = kVar.f5401m;
        dVar.f5285i = kVar.f5402n;
        dVar.f5286j = kVar.f5403o;
        dVar.f5287k = kVar.f5404p;
        dVar.f5288l = kVar.f5405q;
        dVar.f5289m = kVar.f5406r;
        dVar.f5290n = kVar.f5407s;
        dVar.f5291o = kVar.f5408t;
        dVar.f5295s = kVar.f5409u;
        dVar.f5296t = kVar.f5410v;
        dVar.f5297u = kVar.f5411w;
        dVar.f5298v = kVar.f5412x;
        dVar.leftMargin = kVar.f5354H;
        dVar.rightMargin = this.f5342e.f5355I;
        dVar.topMargin = this.f5342e.f5356J;
        dVar.bottomMargin = this.f5342e.f5357K;
        C1752k kVar2 = this.f5342e;
        dVar.f5232A = kVar2.f5366T;
        dVar.f5233B = kVar2.f5365S;
        dVar.f5300x = kVar2.f5362P;
        dVar.f5302z = kVar2.f5364R;
        dVar.f5236E = kVar2.f5413y;
        dVar.f5237F = kVar2.f5414z;
        dVar.f5292p = kVar2.f5348B;
        dVar.f5293q = kVar2.f5349C;
        dVar.f5294r = kVar2.f5350D;
        dVar.f5238G = kVar2.f5347A;
        dVar.f5251T = kVar2.f5351E;
        dVar.f5252U = kVar2.f5352F;
        dVar.f5240I = kVar2.f5368V;
        dVar.f5239H = kVar2.f5369W;
        dVar.f5242K = kVar2.f5371Y;
        dVar.f5241J = kVar2.f5370X;
        dVar.f5254W = kVar2.f5386an;
        dVar.f5255X = kVar2.f5387ao;
        dVar.f5243L = kVar2.f5372Z;
        dVar.f5244M = kVar2.f5373aa;
        dVar.f5247P = kVar2.f5374ab;
        dVar.f5248Q = kVar2.f5375ac;
        dVar.f5245N = kVar2.f5376ad;
        dVar.f5246O = kVar2.f5377ae;
        dVar.f5249R = kVar2.f5378af;
        dVar.f5250S = kVar2.f5379ag;
        dVar.f5253V = kVar2.f5353G;
        dVar.f5279c = kVar2.f5396h;
        dVar.f5258a = kVar2.f5394f;
        dVar.f5278b = kVar2.f5395g;
        dVar.width = kVar2.f5392d;
        dVar.height = this.f5342e.f5393e;
        C1752k kVar3 = this.f5342e;
        String str = kVar3.f5385am;
        if (str != null) {
            dVar.f5256Y = str;
        }
        dVar.f5257Z = kVar3.f5389aq;
        dVar.setMarginStart(kVar3.f5359M);
        dVar.setMarginEnd(this.f5342e.f5358L);
        dVar.mo4863a();
    }

    /* renamed from: d */
    public final void mo4877d(int i, C1745d dVar) {
        this.f5338a = i;
        C1752k kVar = this.f5342e;
        kVar.f5398j = dVar.f5281e;
        kVar.f5399k = dVar.f5282f;
        kVar.f5400l = dVar.f5283g;
        kVar.f5401m = dVar.f5284h;
        kVar.f5402n = dVar.f5285i;
        kVar.f5403o = dVar.f5286j;
        kVar.f5404p = dVar.f5287k;
        kVar.f5405q = dVar.f5288l;
        kVar.f5406r = dVar.f5289m;
        kVar.f5407s = dVar.f5290n;
        kVar.f5408t = dVar.f5291o;
        kVar.f5409u = dVar.f5295s;
        kVar.f5410v = dVar.f5296t;
        kVar.f5411w = dVar.f5297u;
        kVar.f5412x = dVar.f5298v;
        kVar.f5413y = dVar.f5236E;
        kVar.f5414z = dVar.f5237F;
        kVar.f5347A = dVar.f5238G;
        kVar.f5348B = dVar.f5292p;
        kVar.f5349C = dVar.f5293q;
        kVar.f5350D = dVar.f5294r;
        kVar.f5351E = dVar.f5251T;
        kVar.f5352F = dVar.f5252U;
        kVar.f5353G = dVar.f5253V;
        kVar.f5396h = dVar.f5279c;
        kVar.f5394f = dVar.f5258a;
        kVar.f5395g = dVar.f5278b;
        kVar.f5392d = dVar.width;
        this.f5342e.f5393e = dVar.height;
        this.f5342e.f5354H = dVar.leftMargin;
        this.f5342e.f5355I = dVar.rightMargin;
        this.f5342e.f5356J = dVar.topMargin;
        this.f5342e.f5357K = dVar.bottomMargin;
        C1752k kVar2 = this.f5342e;
        kVar2.f5360N = dVar.f5235D;
        kVar2.f5368V = dVar.f5240I;
        kVar2.f5369W = dVar.f5239H;
        kVar2.f5371Y = dVar.f5242K;
        kVar2.f5370X = dVar.f5241J;
        kVar2.f5386an = dVar.f5254W;
        kVar2.f5387ao = dVar.f5255X;
        kVar2.f5372Z = dVar.f5243L;
        kVar2.f5373aa = dVar.f5244M;
        kVar2.f5374ab = dVar.f5247P;
        kVar2.f5375ac = dVar.f5248Q;
        kVar2.f5376ad = dVar.f5245N;
        kVar2.f5377ae = dVar.f5246O;
        kVar2.f5378af = dVar.f5249R;
        kVar2.f5379ag = dVar.f5250S;
        kVar2.f5385am = dVar.f5256Y;
        kVar2.f5362P = dVar.f5300x;
        kVar2.f5364R = dVar.f5302z;
        kVar2.f5361O = dVar.f5299w;
        kVar2.f5363Q = dVar.f5301y;
        kVar2.f5366T = dVar.f5232A;
        kVar2.f5365S = dVar.f5233B;
        kVar2.f5367U = dVar.f5234C;
        kVar2.f5389aq = dVar.f5257Z;
        kVar2.f5358L = dVar.getMarginEnd();
        this.f5342e.f5359M = dVar.getMarginStart();
    }
}
