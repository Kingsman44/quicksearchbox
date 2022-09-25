package com.google.android.libraries.gsa.p1859d.p1861b;

import android.os.Bundle;
import android.os.Message;
import android.util.Pair;
import com.google.android.libraries.gsa.p1859d.C22785g;
import com.google.android.libraries.p10922ab.C146710f;
import java.io.PrintWriter;

/* renamed from: com.google.android.libraries.gsa.d.b.p */
/* compiled from: PG */
final class C22770p extends C22771q {

    /* renamed from: a */
    protected final C22785g f62681a = new C22785g("APIServiceCallback", 40);

    /* renamed from: b */
    final /* synthetic */ C22776v f62682b;

    /* renamed from: c */
    private final C22774t f62683c;

    /* renamed from: d */
    private final boolean f62684d;

    /* renamed from: e */
    private final boolean f62685e;

    /* renamed from: f */
    private C22756b f62686f;

    /* renamed from: g */
    private int f62687g = 0;

    /* renamed from: h */
    private C146710f f62688h;

    public C22770p(C22776v vVar, C22774t tVar, boolean z, boolean z2) {
        this.f62682b = vVar;
        this.f62683c = tVar;
        this.f62684d = z;
        this.f62685e = z2;
    }

    /* renamed from: b */
    private final void m42541b(int i, boolean z) {
        int i2;
        this.f62681a.mo28121a(String.format("updateState %d %b", new Object[]{Integer.valueOf(i), Boolean.valueOf(z)}));
        int i3 = this.f62687g;
        if (z) {
            i2 = i | i3;
            this.f62687g = i2;
        } else {
            i2 = (i ^ -1) & i3;
            this.f62687g = i2;
        }
        boolean z2 = this.f62685e;
        if (z2 || this.f62684d) {
            boolean z3 = (i3 & 3) == 3;
            boolean z4 = (i2 & 3) == 3;
            boolean z5 = z3 && (i3 & 4) == 4;
            boolean z6 = z4 && (i2 & 4) == 4;
            if (z3 != z4) {
                if (z4) {
                    if (this.f62686f == null) {
                        this.f62686f = this.f62682b.mo28096c();
                    }
                    this.f62686f.mo27982c(this.f62685e);
                } else {
                    if (z2) {
                        this.f62686f.mo27981b(false);
                    }
                    C22756b bVar = this.f62686f;
                    if (bVar != null) {
                        bVar.mo27980a();
                    }
                }
            }
            if (z5 == z6) {
                return;
            }
            if (z6) {
                this.f62686f.mo27981b(true);
            } else {
                this.f62686f.mo27981b(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo28069a(PrintWriter printWriter) {
        printWriter.println("    APIServiceCallback");
        boolean z = this.f62684d;
        printWriter.println("      mSupportsPrewarm: " + z);
        boolean z2 = this.f62685e;
        printWriter.println("      mSupportsHotword: " + z2);
        int i = this.f62687g;
        printWriter.println("      mState: " + i);
        printWriter.println("      mClient: ".concat(String.valueOf(String.valueOf(this.f62686f))));
        this.f62681a.mo28124d("      ", printWriter);
    }

    public final boolean handleMessage(Message message) {
        int i = 2;
        boolean z = false;
        switch (message.what) {
            case 0:
                m42541b(1, message.arg1 == 1);
                if (message.arg1 == 1) {
                    if (this.f62685e) {
                        m42541b(4, true);
                    }
                    Pair pair = (Pair) message.obj;
                    this.f62688h = (C146710f) pair.second;
                    String string = ((Bundle) pair.first).getString("internal_request_id");
                    if (true != this.f62685e) {
                        i = 0;
                    }
                    if (this.f62684d) {
                        i |= 4;
                    }
                    this.f62683c.mo28080b(this.f62688h, i);
                    if (string != null) {
                        this.f62682b.f62708c.mo27928m(string);
                    }
                }
                return true;
            case 1:
                if ((((Integer) message.obj).intValue() & 2) != 0) {
                    z = true;
                }
                m42541b(2, z);
                return true;
            case 2:
                m42541b(7, false);
                if (message.arg1 == 0) {
                    this.f62683c.mo28080b(this.f62688h, 0);
                }
                this.f62688h = null;
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                break;
            case 7:
                if (message.arg1 == 1) {
                    z = true;
                }
                m42541b(4, z);
                break;
            default:
                return false;
        }
        return true;
    }
}
