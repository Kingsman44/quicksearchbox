package com.google.android.libraries.p1646ay;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.google.android.libraries.ay.c */
/* compiled from: PG */
public final class C19601c {

    /* renamed from: a */
    private static final C58528ij f54540a = C58528ij.m90011K("com.google.android.libraries.velour.INNER_INTENT", "com.google.android.libraries.velour.INNER_INTENT_URI");

    /* renamed from: a */
    public static Intent m37394a(String str, Intent intent, ComponentName componentName, boolean z) {
        Uri.Builder appendPath = new Uri.Builder().scheme("dynact").authority("legacy").appendPath("velour").appendPath(str);
        Uri data = intent.getData();
        if (data != null) {
            appendPath.appendQueryParameter("data", data.toString());
        }
        Intent intent2 = new Intent(intent.getAction(), appendPath.build());
        intent2.addFlags(intent.getFlags());
        intent2.setComponent(componentName);
        if (z) {
            intent2.putExtra("com.google.android.libraries.velour.INNER_INTENT", intent);
        } else if (m37399f(intent)) {
            intent2.putExtra("com.google.android.libraries.velour.INNER_INTENT_URI", intent.toUri(1));
        } else {
            throw new RuntimeException("Trying to create an external intent with non-not serializable inner intent.");
        }
        return intent2;
    }

    /* renamed from: b */
    public static Intent m37395b(Intent intent) {
        Bundle bundle;
        String queryParameter;
        Intent h = m37401h(intent.getStringExtra("com.google.android.libraries.velour.INNER_INTENT_URI"));
        if (h == null) {
            h = (Intent) intent.getParcelableExtra("com.google.android.libraries.velour.INNER_INTENT");
        }
        if (h == null) {
            h = new Intent();
            Uri data = intent.getData();
            Uri uri = null;
            if (!(data == null || (queryParameter = data.getQueryParameter("data")) == null)) {
                uri = Uri.parse(queryParameter);
            }
            h.setData(uri);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundle = new Bundle(extras);
            C58800sl lA = f54540a.iterator();
            while (lA.hasNext()) {
                bundle.remove((String) lA.next());
            }
        } else {
            bundle = new Bundle();
        }
        h.setExtrasClassLoader(C19601c.class.getClassLoader());
        if (!bundle.isEmpty()) {
            h.putExtras(bundle);
        }
        h.addFlags(intent.getFlags() & 5242880);
        return h;
    }

    /* renamed from: c */
    public static Intent m37396c(Intent intent, Intent intent2) {
        Intent intent3 = new Intent(intent);
        intent3.putExtra("com.google.android.libraries.velour.INNER_INTENT", intent2);
        return intent3;
    }

    /* renamed from: d */
    public static String m37397d(Intent intent) {
        List<String> pathSegments = intent.getData().getPathSegments();
        if (pathSegments.size() < 2) {
            return null;
        }
        return pathSegments.get(1);
    }

    /* renamed from: e */
    public static boolean m37398e(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null || !"dynact".equals(data.getScheme())) {
            return false;
        }
        List<String> pathSegments = data.getPathSegments();
        if (pathSegments.size() != 2 || TextUtils.isEmpty(pathSegments.get(0)) || TextUtils.isEmpty(pathSegments.get(1))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m37399f(Intent intent) {
        Intent h = m37401h(intent.toUri(1));
        if (h != null) {
            Bundle extras = h.getExtras();
            Bundle extras2 = intent.getExtras();
            if (extras != null && extras2 != null) {
                return extras2.keySet().equals(extras.keySet());
            }
            if (extras == extras2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static Intent m37400g(Intent intent, ComponentName componentName) {
        return m37394a("WeatherActivity", intent, componentName, false);
    }

    /* renamed from: h */
    private static Intent m37401h(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Intent.parseUri(str, 1);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
