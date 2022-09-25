package com.google.android.apps.search.sceneviewer.p10647b;

import android.net.Uri;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.sceneviewer.b.a */
/* compiled from: PG */
public final class C141533a {

    /* renamed from: a */
    static final C58528ij f384160a = C58528ij.m90012L("https", "sceneviewer", "intent");

    /* renamed from: b */
    static final C58528ij f384161b = C58528ij.m90012L("1.0", "1.1", "1.2");

    /* renamed from: c */
    private static final C59071e f384162c = C59071e.m91332i("com.google.android.apps.search.sceneviewer.b.a");

    /* renamed from: A */
    public static boolean m229728A(Uri uri) {
        String queryParameter = uri.getQueryParameter("enable_vertical_placement");
        return queryParameter != null && Boolean.parseBoolean(queryParameter);
    }

    /* renamed from: a */
    public static Uri m229729a(Uri uri) {
        String queryParameter = uri.getQueryParameter("link");
        if (queryParameter == null) {
            return null;
        }
        return Uri.parse(queryParameter);
    }

    /* renamed from: b */
    public static Types.InitialScale m229730b(Uri uri) {
        String queryParameter = uri.getQueryParameter("initial_scale");
        if (queryParameter == null) {
            return null;
        }
        if (queryParameter.toLowerCase(Locale.getDefault()).equals("auto")) {
            Types.InitialScale.Builder newBuilder = Types.InitialScale.newBuilder();
            newBuilder.setScaling(Types.Scaling.AUTO);
            return (Types.InitialScale) newBuilder.build();
        }
        try {
            float parseFloat = Float.parseFloat(queryParameter);
            Types.InitialScale.Builder newBuilder2 = Types.InitialScale.newBuilder();
            newBuilder2.setScaling(Types.Scaling.FIXED);
            newBuilder2.setScale(parseFloat);
            return (Types.InitialScale) newBuilder2.build();
        } catch (NumberFormatException e) {
            ((C59052c) ((C59052c) ((C59052c) f384162c.mo56226d()).mo56382g(e)).mo56372aa(41727)).mo56386p("Invalid value provided for initialScaleString");
            return null;
        }
    }

    /* renamed from: c */
    public static Types.SceneViewerParams.LightingMode m229731c(Uri uri) {
        String queryParameter = uri.getQueryParameter("lighting_mode");
        if (queryParameter == null) {
            return Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
        }
        String c = C58890d.m90988c(queryParameter);
        if (C58890d.m90988c(Types.SceneViewerParams.LightingMode.AMBIENT_INTENSITY.name()).equals(c)) {
            return Types.SceneViewerParams.LightingMode.AMBIENT_INTENSITY;
        }
        return C58890d.m90988c(Types.SceneViewerParams.LightingMode.ENVIRONMENTAL_HDR.name()).equals(c) ? Types.SceneViewerParams.LightingMode.ENVIRONMENTAL_HDR : Types.SceneViewerParams.LightingMode.UNSPECIFIED_LIGHTING;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference m229732d(android.net.Uri r4) {
        /*
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference.THREED_PREFERRED
            java.lang.String r1 = "mode"
            java.lang.String r4 = r4.getQueryParameter(r1)
            if (r4 == 0) goto L_0x0050
            int r0 = r4.hashCode()
            r1 = -1840821773(0xffffffff924749f3, float:-6.2884478E-28)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x0034
            r1 = -751582470(0xffffffffd333c2fa, float:-7.7207031E11)
            if (r0 == r1) goto L_0x002a
            r1 = 972113050(0x39f1449a, float:4.6018214E-4)
            if (r0 == r1) goto L_0x0020
            goto L_0x003e
        L_0x0020:
            java.lang.String r0 = "3d_only"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003e
            r4 = 2
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "ar_only"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003e
            r4 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "ar_preferred"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x003e:
            r4 = -1
        L_0x003f:
            if (r4 == 0) goto L_0x004e
            if (r4 == r3) goto L_0x004b
            if (r4 == r2) goto L_0x0048
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference.THREED_PREFERRED
            goto L_0x0050
        L_0x0048:
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference.THREED_ONLY
            goto L_0x0050
        L_0x004b:
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference.AR_PREFERRED
            goto L_0x0050
        L_0x004e:
            com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference r0 = com.google.p3723ar.core.viewer.jniprotolite.Types.SceneViewerParams.ModePreference.AR_ONLY
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.sceneviewer.p10647b.C141533a.m229732d(android.net.Uri):com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference");
    }

    /* renamed from: e */
    public static Types.SceneViewerParams.StreamingMode m229733e(Uri uri) {
        if ("disabled".equals(uri.getQueryParameter("streaming_mode"))) {
            return Types.SceneViewerParams.StreamingMode.STREAMING_DISABLED;
        }
        return Types.SceneViewerParams.StreamingMode.STREAMING_PREFERRED;
    }

    /* renamed from: f */
    public static String m229734f(Uri uri) {
        return uri.getQueryParameter("auto_color");
    }

    /* renamed from: g */
    public static String m229735g(Uri uri) {
        return uri.getQueryParameter("cloudArAssetId");
    }

    /* renamed from: h */
    public static String m229736h(Uri uri) {
        String queryParameter = uri.getQueryParameter("cta_color");
        if (queryParameter == null) {
            return queryParameter;
        }
        if (!queryParameter.startsWith("#") || queryParameter.length() != 7) {
            return null;
        }
        return queryParameter;
    }

    /* renamed from: i */
    public static String m229737i(Uri uri) {
        return uri.getQueryParameter("cta_text");
    }

    /* renamed from: j */
    public static String m229738j(Uri uri) {
        return uri.getQueryParameter("link");
    }

    /* renamed from: k */
    public static String m229739k(Uri uri) {
        return uri.getQueryParameter("file_draco");
    }

    /* renamed from: l */
    public static String m229740l(Uri uri) {
        return uri.getQueryParameter("title");
    }

    /* renamed from: m */
    public static String m229741m(Uri uri) {
        String path;
        if (f384160a.contains(uri.getScheme())) {
            String host = uri.getHost();
            if (("vr.google.com".equals(host) || "arvr.google.com".equals(host)) && (path = uri.getPath()) != null) {
                List i = C58869cf.m90936b(new C58903m('/')).mo56155i(path);
                if (i.size() >= 2 && "scene-viewer".equals(i.get(1)) && (!"arvr.google.com".equals(host) || (i.size() >= 3 && f384161b.contains(i.get(2))))) {
                    String queryParameter = uri.getQueryParameter("file");
                    if (C58837ba.m90859h(queryParameter)) {
                        return null;
                    }
                    return queryParameter;
                }
            }
        }
        return uri.buildUpon().clearQuery().build().toString();
    }

    /* renamed from: n */
    public static String m229742n(Uri uri) {
        return uri.getQueryParameter("pt");
    }

    /* renamed from: o */
    public static String m229743o(Uri uri) {
        return uri.getQueryParameter("referrer");
    }

    /* renamed from: p */
    public static String m229744p(Uri uri) {
        return uri.getQueryParameter("session_id");
    }

    /* renamed from: q */
    public static String m229745q(Uri uri) {
        return uri.getQueryParameter("share_text");
    }

    /* renamed from: r */
    public static String m229746r(Uri uri) {
        return uri.getQueryParameter("sound");
    }

    /* renamed from: s */
    public static String m229747s(Uri uri) {
        return uri.getQueryParameter("streaming_service_address");
    }

    /* renamed from: t */
    public static String m229748t(Uri uri) {
        return uri.getQueryParameter("streaming_api_key");
    }

    /* renamed from: u */
    public static String m229749u(Uri uri) {
        return uri.getQueryParameter("video");
    }

    /* renamed from: v */
    public static boolean m229750v(Uri uri) {
        String queryParameter = uri.getQueryParameter("dark_mode");
        return queryParameter != null && Boolean.parseBoolean(queryParameter);
    }

    /* renamed from: w */
    public static boolean m229751w(Uri uri) {
        String queryParameter = uri.getQueryParameter("enable_dimension_visualization");
        return queryParameter != null && Boolean.parseBoolean(queryParameter);
    }

    /* renamed from: x */
    public static boolean m229752x(Uri uri) {
        String queryParameter = uri.getQueryParameter("disable_occlusion");
        return queryParameter != null && Boolean.parseBoolean(queryParameter);
    }

    /* renamed from: y */
    public static boolean m229753y(Uri uri) {
        String queryParameter = uri.getQueryParameter("onboarding_guidance_disabled");
        return queryParameter != null && Boolean.parseBoolean(queryParameter);
    }

    /* renamed from: z */
    public static boolean m229754z(Uri uri) {
        String queryParameter = uri.getQueryParameter("enable_server_touch_handle");
        return queryParameter != null && Boolean.parseBoolean(queryParameter);
    }
}
