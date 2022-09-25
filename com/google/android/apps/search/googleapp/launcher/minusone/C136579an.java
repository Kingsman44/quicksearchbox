package com.google.android.apps.search.googleapp.launcher.minusone;

import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.core.content.C1877c;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47231d;
import java.io.PrintWriter;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.an */
/* compiled from: PG */
public final /* synthetic */ class C136579an {
    /* renamed from: a */
    public static void m221960a(C136580ao aoVar, PrintWriter printWriter, String str, Fragment fragment) {
        String simpleName = aoVar.getClass().getSimpleName();
        printWriter.println("         MinusOneBehavior: " + simpleName);
        if (fragment != null) {
            String simpleName2 = fragment.getClass().getSimpleName();
            printWriter.println("          HeaderFragment: " + simpleName2);
        }
    }

    /* renamed from: b */
    public static void m221961b(C136580ao aoVar, View view, View view2) {
        if (aoVar.mo113248h()) {
            C136621c.m222081a(view, view2);
        }
    }

    /* renamed from: c */
    public static void m221962c(C136580ao aoVar, View view) {
        if (aoVar.mo113248h()) {
            C2043bi.m5530X(view, ((Drawable) Objects.requireNonNull(C1877c.m5125a(view.getContext(), R.drawable.googleapp_minus_one_feed_background))).mutate());
            C136621c.m222081a(view, view.findViewById(R.id.googleapp_header_container));
        }
    }

    /* renamed from: d */
    public static void m221963d(Fragment fragment, Consumer consumer) {
        if (fragment != null) {
            Object z = ((C47231d) fragment).mo17754z();
            if (z instanceof C136560a) {
                consumer.accept((C136560a) z);
            }
        }
    }

    /* renamed from: e */
    public static void m221964e(C136580ao aoVar, View view, View view2, int i, Fragment fragment) {
        m221963d(fragment, new C136578am(i));
        aoVar.mo113244d(view, view2);
    }

    /* renamed from: f */
    public static void m221965f(float f, Fragment fragment) {
        m221963d(fragment, new C136577al(f));
    }

    /* renamed from: g */
    public static void m221966g(C136580ao aoVar, View view) {
        aoVar.mo113244d(view, view.findViewById(R.id.googleapp_header_container));
    }
}
