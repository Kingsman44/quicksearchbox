package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.util.p1935a.C23336a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.i */
/* compiled from: PG */
public final class C84134i extends C84121aa {

    /* renamed from: a */
    private static final C59071e f229075a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.i");

    /* renamed from: b */
    private static final Pattern f229076b = Pattern.compile("(www\\.)?google(\\.co)?\\.[^.]+");

    /* renamed from: c */
    private final C22871g f229077c;

    /* renamed from: d */
    private final C91097g f229078d;

    /* renamed from: e */
    private final C84150y f229079e;

    /* renamed from: f */
    private final C85923cq f229080f;

    /* renamed from: g */
    private final Context f229081g;

    public C84134i(C22871g gVar, C91097g gVar2, C84150y yVar, C85923cq cqVar, Context context) {
        this.f229077c = gVar;
        this.f229078d = gVar2;
        this.f229079e = yVar;
        this.f229080f = cqVar;
        this.f229081g = context;
    }

    /* renamed from: e */
    private static Bundle m134080e(Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("exception", th);
        return bundle;
    }

    /* renamed from: f */
    private final void m134081f(Intent intent, Bundle bundle) {
        intent.setFlags(intent.getFlags() | 268435456);
        this.f229078d.mo65094f(intent, bundle);
    }

    /* renamed from: a */
    public final void mo77551a(int i, Intent intent) {
        this.f229077c.mo28212l("CanvasWorkerNavigator#startIntent", new C84132g(this, intent, i));
    }

    /* renamed from: b */
    public final void mo77572b(int i, String str, Bundle bundle) {
        try {
            Intent a = C23336a.m43768a(str);
            String i2 = this.f229080f.mo83211i();
            if (true != f229076b.matcher(i2).matches()) {
                i2 = "www.google.com";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.encodedAuthority(i2);
            builder.scheme("http");
            Uri build = builder.build();
            a.putExtra("android.intent.extra.REFERRER", build);
            Bundle bundle2 = new Bundle();
            if (a.hasExtra("com.android.browser.headers")) {
                bundle2.putAll(a.getBundleExtra("com.android.browser.headers"));
            }
            bundle2.putString("Referer", build.toString());
            a.putExtra("com.android.browser.headers", bundle2);
            ResolveInfo resolveActivity = this.f229081g.getPackageManager().resolveActivity(a, 65536);
            if (resolveActivity != null) {
                if (resolveActivity.activityInfo != null) {
                    String str2 = resolveActivity.activityInfo.packageName;
                    if (!TextUtils.isEmpty(str2) && C90721ae.f253800i.contains(str2)) {
                        a.putExtra("trusted_application_code_extra", PendingIntent.getActivity(this.f229081g, 0, new Intent(), 67108864, (Bundle) null));
                        a.putExtra("com.android.browser.application_id", this.f229081g.getPackageName());
                        a.putExtra("create_new_tab", true);
                    }
                }
            }
            m134081f(a, bundle);
        } catch (URISyntaxException e) {
            C59104x c = f229075a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Navigator");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7056)).mo56386p("URI parsing failed.");
            try {
                this.f229079e.mo77566d(i, 458754, m134080e(e), (byte[]) null);
            } catch (RemoteException e2) {
                C59104x c2 = f229075a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "Navigator");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(7057)).mo56386p("RemoteException while logging error event: ");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo77573c(Intent intent, int i) {
        try {
            m134081f(intent, (Bundle) null);
        } catch (ActivityNotFoundException | SecurityException e) {
            C59104x c = f229075a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Navigator");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7058)).mo56389s("Failure to fire intent: %s", intent);
            try {
                this.f229079e.mo77566d(i, C89885b.GRECO_GRAMMAR_LOADER_READ_FAILED_VALUE, m134080e(e), (byte[]) null);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: d */
    public final void mo77552d(int i, String str, boolean z, Bundle bundle) {
        this.f229077c.mo28212l("Handle non-search uri", new C84133h(this, i, str, bundle));
    }
}
