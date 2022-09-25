package com.google.android.libraries.componentview.p1697d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.componentview.components.base.p1687a.C19919at;
import com.google.android.libraries.componentview.components.base.p1687a.C19920au;
import com.google.android.libraries.componentview.components.base.p1687a.C20002y;
import com.google.android.libraries.componentview.components.base.p1687a.C20003z;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.services.application.C20599bz;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.libraries.componentview.d.m */
/* compiled from: PG */
public final class C20482m {

    /* renamed from: a */
    private static float f57599a = -1.0f;

    /* renamed from: a */
    public static float m38433a(Context context) {
        float f = f57599a;
        if (f >= 0.0f) {
            return f;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        f57599a = f2;
        return f2;
    }

    /* renamed from: b */
    public static float m38434b(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: c */
    public static int m38435c(Context context, C20003z zVar) {
        if (zVar == null) {
            return 0;
        }
        int a = C20002y.m37792a(zVar.f56048b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return -2;
        }
        if (i == 2) {
            return -1;
        }
        return (int) (m38433a(context) * zVar.f56047a);
    }

    /* renamed from: d */
    public static int m38436d(C19920au auVar) {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < auVar.f55726a.size(); i3++) {
            int a = C19919at.m37779a(auVar.f55726a.mo58914d(i3));
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 0:
                    i = 8388611;
                    break;
                case 1:
                    i2 |= 48;
                    continue;
                case 2:
                    i = 8388613;
                    break;
                case 3:
                    i2 |= 80;
                    continue;
                case 4:
                    i2 |= 119;
                    continue;
                case 5:
                    i2 |= 7;
                    continue;
                case 6:
                    i2 |= 112;
                    continue;
                case 7:
                    i2 |= 17;
                    continue;
                case 8:
                    i2 |= 1;
                    continue;
                default:
                    i2 |= 16;
                    continue;
            }
            i2 |= i;
        }
        return i2;
    }

    /* renamed from: e */
    public static Activity m38437e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m38437e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static Uri m38438f(Uri uri, String str, String str2) {
        String str3;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder buildUpon = uri.buildUpon();
        if (!queryParameterNames.contains(str)) {
            return buildUpon.appendQueryParameter(str, str2).build();
        }
        buildUpon.clearQuery();
        for (String next : queryParameterNames) {
            if (next.equals(str)) {
                str3 = str2;
            } else {
                str3 = uri.getQueryParameter(next);
            }
            buildUpon.appendQueryParameter(next, str3);
        }
        return buildUpon.build();
    }

    /* renamed from: g */
    public static C19744c m38439g(List list) {
        try {
            Iterator it = list.iterator();
            long j = 0;
            while (it.hasNext()) {
                j = Math.max(j, ((C19744c) ((C60870cx) it.next()).get()).f54848a);
            }
            return new C19744c(j);
        } catch (Exception unused) {
            return new C19744c();
        }
    }

    /* renamed from: h */
    public static C20599bz m38440h(String str) {
        C20614e eVar = new C20614e();
        eVar.mo25535e(C19742a.UNSUPPORTED_OPERATION_EXCEPTION);
        eVar.f57822b = str;
        eVar.f57821a = new UnsupportedOperationException(str);
        return eVar.mo25531a();
    }

    /* renamed from: i */
    public static void m38441i(View view, int i) {
        if (!(view instanceof ImageView) && !(view instanceof ImageButton)) {
            view.setTag("ve=" + i);
        }
    }

    /* renamed from: j */
    public static void m38442j(List list, Executor executor, SettableFuture settableFuture) {
        if (list.isEmpty()) {
            settableFuture.mo57356n(new C19744c());
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C60870cx cxVar = (C60870cx) it.next();
            if (!cxVar.isDone()) {
                arrayList.add(cxVar);
            }
        }
        if (arrayList.isEmpty()) {
            settableFuture.mo57356n(m38439g(list));
            return;
        }
        C20480k kVar = new C20480k(new AtomicInteger(arrayList.size()), settableFuture, list);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C60870cx) arrayList.get(i)).mo4106b(kVar, executor);
        }
    }

    /* renamed from: k */
    public static void m38443k(C60870cx cxVar, SettableFuture settableFuture, Executor executor) {
        cxVar.mo4106b(new C20481l(settableFuture, cxVar), executor);
    }

    /* renamed from: l */
    public static boolean m38444l(Context context) {
        return m38437e(context) != null;
    }

    /* renamed from: m */
    public static boolean m38445m(C19920au auVar) {
        return auVar != null && auVar.f55726a.size() > 0;
    }

    /* renamed from: n */
    public static boolean m38446n(Context context) {
        return (context.getApplicationContext().getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: o */
    public static boolean m38447o(String str) {
        return str == null || BuildConfig.FLAVOR.equals(str);
    }

    /* renamed from: p */
    public static void m38448p(View view, int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = i2 != 3 ? 0 : 4;
            }
        }
        view.setImportantForAccessibility(i3);
    }
}
