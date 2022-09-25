package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b;

import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4535g.C59203do;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.j */
/* compiled from: PG */
final class C115151j implements C90991b {

    /* renamed from: a */
    final long f319584a;

    /* renamed from: b */
    final C115153l f319585b;

    /* renamed from: c */
    final /* synthetic */ C115155n f319586c;

    public C115151j(C115155n nVar, long j, C115153l lVar) {
        this.f319586c = nVar;
        this.f319584a = j;
        this.f319585b = lVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        String str2;
        String str3;
        fVar.mo85292s(C90752i.m148232f(new Date(this.f319584a)));
        int f = this.f319585b.mo101854f();
        String a = C115154m.m190856a(f);
        if (f != 0) {
            C91005e c = fVar.mo85279c(a);
            int f2 = this.f319585b.mo101854f();
            int i = f2 - 1;
            if (f2 != 0) {
                if (i != 0) {
                    str = "UNKNOWN";
                    if (i != 1) {
                        if (i == 2 && this.f319585b.mo101851d().mo56113h()) {
                            C84275o oVar = (C84275o) this.f319585b.mo101851d().mo56107c();
                            int c2 = oVar.mo77797c();
                            if (c2 == 2) {
                                str2 = "PAUSED";
                            } else if (c2 == 3) {
                                str2 = "PLAYING";
                            } else if (c2 == 6) {
                                str2 = "BUFFERING";
                            } else if (c2 != 7) {
                                str2 = String.format(Locale.getDefault(), "OTHER_%d", new Object[]{Integer.valueOf(c2)});
                            } else {
                                str2 = "ERROR";
                            }
                            StringBuilder sb = new StringBuilder(str2);
                            if (oVar.mo77801g() != 0) {
                                sb.append(" MP=");
                                sb.append(oVar.mo77801g());
                            }
                            if (oVar.mo77812r() && oVar.mo77795a() > C59203do.f157270a) {
                                sb.append(" BP=");
                                sb.append(String.format(Locale.getDefault(), "%.2f%%", new Object[]{Double.valueOf(oVar.mo77795a())}));
                            }
                            if (oVar.mo77810p() && oVar.mo77803i().mo56113h()) {
                                sb.append(" EC=");
                                sb.append(oVar.mo77803i().mo56107c());
                            }
                            if (oVar.mo77806l().mo56113h()) {
                                if (this.f319586c.f319587a.peek() == this || !((Boolean) this.f319585b.mo101852e().mo56109e(false)).booleanValue()) {
                                    str3 = (String) oVar.mo77806l().mo56107c();
                                } else {
                                    str3 = "^";
                                }
                                sb.append(" ID=");
                                sb.append(str3);
                            }
                            str = sb.toString();
                        }
                    } else if (this.f319585b.mo101849b().mo56113h()) {
                        StringBuilder sb2 = new StringBuilder(((C84269i) this.f319585b.mo101849b().mo56107c()).name());
                        if (this.f319585b.mo101850c().mo56113h() && ((C84271k) this.f319585b.mo101850c().mo56107c()).mo77760d().mo56113h()) {
                            sb2.append(" SPM=");
                            sb2.append(((C84271k) this.f319585b.mo101850c().mo56107c()).mo77760d().mo56107c());
                        }
                        str = sb2.toString();
                    }
                } else {
                    str = String.valueOf(this.f319585b.mo101848a().mo56109e(-1L));
                }
                c.mo85276a(C90752i.m148229c(str));
                return;
            }
            throw null;
        }
        throw null;
    }
}
