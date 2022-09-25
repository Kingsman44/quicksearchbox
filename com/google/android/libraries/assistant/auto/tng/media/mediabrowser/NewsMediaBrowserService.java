package com.google.android.libraries.assistant.auto.tng.media.mediabrowser;

import android.app.Service;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.p031v4.media.MediaBrowserCompat;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.util.Base64;
import androidx.media.C2434k;
import androidx.media.C2449z;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.gms.common.C143701ac;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.C47211g;
import com.google.apps.tiktok.tracing.C47550bb;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import dagger.p5294a.C68225k;
import java.util.ArrayList;

/* compiled from: PG */
public final class NewsMediaBrowserService extends C14045g implements C47231d {

    /* renamed from: f */
    private C14055q f42610f;

    /* renamed from: g */
    private boolean f42611g;

    /* renamed from: h */
    private final C47550bb f42612h = new C47550bb(this);

    /* renamed from: i */
    private boolean f42613i;

    @Deprecated
    public NewsMediaBrowserService() {
        C19559g.m37304c();
    }

    /* renamed from: b */
    public final void mo5831b(String str, C2449z zVar) {
        C47573bx c = this.f42612h.mo51411c("onLoadChildren");
        try {
            C14055q j = mo17754z();
            ((C59052c) ((C59052c) C14055q.f42679a.mo56224b()).mo56372aa(45280)).mo56389s("onLoadChildren() with parent ID: %s", str);
            if (str.equals("_NEWS_BROWSER_ROOT_")) {
                zVar.mo5863c(C58485gu.m89846n(new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat("_NEWS_ROOT_FOLDER_", j.f42683e.getResources().getString(R.string.tng_google_news_browsable_name), (CharSequence) null, (CharSequence) null, (Bitmap) null, (Uri) null, (Bundle) null, (Uri) null), 1)));
            } else if (str.equals("_NEWS_ROOT_FOLDER_")) {
                zVar.mo5857b();
                ((C14047i) j.f42685g.mo17428b()).mo21389a(zVar);
                if (j.f42686h == null) {
                    j.f42686h = new C14054p(j, str);
                    C14043e eVar = j.f42680b;
                    eVar.f42665d.add(j.f42686h);
                }
            } else {
                ((C59052c) ((C59052c) C14055q.f42679a.mo56225c()).mo56372aa(45281)).mo56386p("Invalid media ID, can not load children");
                zVar.mo5863c((Object) null);
            }
            c.close();
            return;
        } catch (Throwable th) {
            C14053o.m30347a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final C2434k mo5835h(String str, int i) {
        C47573bx c = this.f42612h.mo51411c("onGetRoot");
        try {
            C14055q j = mo17754z();
            C14060v vVar = j.f42684f;
            Context context = j.f42683e;
            C2434k kVar = null;
            if (i != 1000) {
                if (Process.myUid() != i) {
                    if (!((C58759qy) C14060v.f42697b).f156534a.equals(str)) {
                        PackageInfo a = C14060v.m30349a(context, "android");
                        int i2 = 0;
                        if (!(a == null || a.signatures == null)) {
                            if (a.signatures.length != 0) {
                                PackageInfo a2 = C14060v.m30349a(context, str);
                                if (a2 != null && a2.signatures != null && a2.signatures.length > 0 && a.signatures[0].equals(a2.signatures[0])) {
                                }
                            }
                        }
                        if (!((Boolean) vVar.f42698c.mo17428b()).booleanValue() || !str.equals("com.google.android.projection.gearhead") || !vVar.f42699d.mo119084c(str)) {
                            PackageInfo a3 = C14060v.m30349a(context, str);
                            if (a3 != null) {
                                if (a3.signatures.length != 1) {
                                    ((C59052c) ((C59052c) C14060v.f42696a.mo56226d()).mo56372aa(45293)).mo56386p("Caller does not have exactly one signature certificate!");
                                } else {
                                    String encodeToString = Base64.encodeToString(a3.signatures[0].toByteArray(), 2);
                                    if (vVar.f42700e.isEmpty()) {
                                        vVar.f42700e = C14060v.m30350b(context.getResources().getXml(R.xml.allowed_media_browser_callers));
                                    }
                                    ArrayList arrayList = (ArrayList) vVar.f42700e.get(encodeToString);
                                    if (arrayList == null) {
                                        vVar.f42700e.isEmpty();
                                    } else {
                                        int size = arrayList.size();
                                        while (i2 < size) {
                                            C14059u uVar = (C14059u) arrayList.get(i2);
                                            if (str.equals(uVar.f42694b)) {
                                                String str2 = uVar.f42693a;
                                                String str3 = uVar.f42694b;
                                                boolean z = uVar.f42695c;
                                            } else {
                                                String str4 = uVar.f42694b;
                                                i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ((C59052c) ((C59052c) C14055q.f42679a.mo56225c()).mo56372aa(45274)).mo56389s("Caller %s is not allowed to use the news media browser service", str);
                    c.close();
                    return kVar;
                }
            }
            ((C59052c) ((C59052c) C14055q.f42679a.mo56224b()).mo56372aa(45273)).mo56389s("onGetRoot() from client: %s", str);
            kVar = new C2434k("_NEWS_BROWSER_ROOT_", (Bundle) null);
            c.close();
            return kVar;
        } catch (Throwable th) {
            C14053o.m30347a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final C14055q mo17754z() {
        C14055q qVar = this.f42610f;
        if (qVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f42613i) {
            return qVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    public final void onCreate() {
        C47558bi a;
        C47558bi a2;
        C47573bx b = this.f42612h.mo51410b();
        try {
            this.f42611g = true;
            C58838bb.m90883r(getApplication() instanceof C47211g);
            if (this.f42610f == null) {
                if (!this.f42611g) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                } else if (!this.f42613i) {
                    a = C47831fm.m85006a("CreateComponent");
                    mo21392i().mo17653jN();
                    a.close();
                    a2 = C47831fm.m85006a("CreatePeer");
                    Object jN = mo21392i().mo17653jN();
                    C14043e eVar = (C14043e) ((amb) jN).f197807b.b.f200009bW.mo17428b();
                    Service service = ((amb) jN).f197754a;
                    if (service instanceof NewsMediaBrowserService) {
                        NewsMediaBrowserService newsMediaBrowserService = (NewsMediaBrowserService) service;
                        C68225k.m98532d(newsMediaBrowserService);
                        C16941d aj = ((amb) jN).f197807b.d.mo67733aj();
                        Context context = (Context) ((amb) jN).f197807b.g.mo17428b();
                        this.f42610f = new C14055q(eVar, newsMediaBrowserService, (Context) ((amb) jN).f197807b.g.mo17428b(), aj, new C14060v((C143701ac) ((amb) jN).f197807b.a.f203603t.mo17428b(), ((amb) jN).f197807b.d.f201724eX), ((amb) jN).f197807b.d.f201725eY);
                        a2.close();
                        this.f42610f.f42687i = this;
                    } else {
                        String obj = C14055q.class.toString();
                        String valueOf = String.valueOf(service.getClass());
                        throw new IllegalStateException("Attempt to inject a Service wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                } else {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
            }
            C14055q j = mo17754z();
            super.onCreate();
            ((C59052c) ((C59052c) C14055q.f42679a.mo56224b()).mo56372aa(45275)).mo56386p("onCreate()");
            MediaSessionCompat.Token a3 = j.f42682d.mo23091a();
            if (a3 == null) {
                ((C59052c) ((C59052c) C14055q.f42679a.mo56225c()).mo56372aa(45277)).mo56386p("News media session token could not be retrieved, news will not be refreshed");
            } else {
                ((C59052c) ((C59052c) C14055q.f42679a.mo56224b()).mo56372aa(45276)).mo56386p("News media session token retrieved");
                j.f42681c.mo5836iP(a3);
            }
            this.f42611g = false;
            b.close();
            return;
            throw th;
            throw th;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                C14053o.m30347a(th, th2);
            }
            throw th;
        }
    }

    public final void onDestroy() {
        C47573bx d = this.f42612h.mo51412d();
        try {
            super.onDestroy();
            C14055q j = mo17754z();
            ((C59052c) ((C59052c) C14055q.f42679a.mo56224b()).mo56372aa(45278)).mo56386p("onDestroy()");
            C14054p pVar = j.f42686h;
            if (pVar != null) {
                j.f42680b.f42665d.remove(pVar);
            }
            this.f42613i = true;
            d.close();
            return;
        } catch (Throwable th) {
            C14053o.m30347a(th, th);
        }
        throw th;
    }
}
