package android.support.p031v4.app;

import androidx.lifecycle.C2383n;

/* renamed from: android.support.v4.app.cd */
/* compiled from: PG */
final class C0212cd {

    /* renamed from: a */
    int f800a;

    /* renamed from: b */
    Fragment f801b;

    /* renamed from: c */
    boolean f802c;

    /* renamed from: d */
    int f803d;

    /* renamed from: e */
    int f804e;

    /* renamed from: f */
    int f805f;

    /* renamed from: g */
    int f806g;

    /* renamed from: h */
    C2383n f807h;

    /* renamed from: i */
    C2383n f808i;

    public C0212cd() {
    }

    public C0212cd(int i, Fragment fragment) {
        this.f800a = i;
        this.f801b = fragment;
        this.f802c = false;
        this.f807h = C2383n.RESUMED;
        this.f808i = C2383n.RESUMED;
    }

    public C0212cd(Fragment fragment, C2383n nVar) {
        this.f800a = 10;
        this.f801b = fragment;
        this.f802c = false;
        this.f807h = fragment.mMaxState;
        this.f808i = nVar;
    }

    public C0212cd(int i, Fragment fragment, byte[] bArr) {
        this.f800a = i;
        this.f801b = fragment;
        this.f802c = true;
        this.f807h = C2383n.RESUMED;
        this.f808i = C2383n.RESUMED;
    }

    public C0212cd(C0212cd cdVar) {
        this.f800a = cdVar.f800a;
        this.f801b = cdVar.f801b;
        this.f802c = cdVar.f802c;
        this.f803d = cdVar.f803d;
        this.f804e = cdVar.f804e;
        this.f805f = cdVar.f805f;
        this.f806g = cdVar.f806g;
        this.f807h = cdVar.f807h;
        this.f808i = cdVar.f808i;
    }
}
