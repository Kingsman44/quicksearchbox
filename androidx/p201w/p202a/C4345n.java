package androidx.p201w.p202a;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.p201w.C4358b;
import java.io.File;

/* renamed from: androidx.w.a.n */
/* compiled from: PG */
public final class C4345n {
    /* renamed from: a */
    public static int m12457a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    /* renamed from: b */
    public static int m12458b(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    /* renamed from: c */
    public static ServiceWorkerController m12459c() {
        return ServiceWorkerController.getInstance();
    }

    /* renamed from: d */
    public static ServiceWorkerWebSettings m12460d(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    /* renamed from: e */
    public static C4355x m12461e(ServiceWorkerController serviceWorkerController) {
        m12460d(serviceWorkerController);
        return new C4355x();
    }

    /* renamed from: f */
    public static File m12462f(Context context) {
        return context.getDataDir();
    }

    /* renamed from: g */
    public static void m12463g(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowContentAccess(z);
    }

    /* renamed from: h */
    public static void m12464h(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setAllowFileAccess(z);
    }

    /* renamed from: i */
    public static void m12465i(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z);
    }

    /* renamed from: j */
    public static void m12466j(ServiceWorkerWebSettings serviceWorkerWebSettings, int i) {
        serviceWorkerWebSettings.setCacheMode(i);
    }

    /* renamed from: k */
    public static void m12467k(WebSettings webSettings, int i) {
        webSettings.setDisabledActionModeMenuItems(i);
    }

    /* renamed from: l */
    public static void m12468l(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    /* renamed from: m */
    public static void m12469m(ServiceWorkerController serviceWorkerController, C4358b bVar) {
        serviceWorkerController.setServiceWorkerClient(new C4351t(bVar));
    }

    /* renamed from: n */
    public static boolean m12470n(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    /* renamed from: o */
    public static boolean m12471o(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    /* renamed from: p */
    public static boolean m12472p(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    /* renamed from: q */
    public static boolean m12473q(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }
}
