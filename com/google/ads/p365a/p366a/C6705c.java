package com.google.ads.p365a.p366a;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.a.a.c */
/* compiled from: PG */
public final class C6705c {

    /* renamed from: a */
    public static final /* synthetic */ int f20026a = 0;

    /* renamed from: b */
    private static final Pattern f20027b = Pattern.compile("[?&]adurl=([^&]*)");

    /* renamed from: c */
    private static final C58485gu f20028c = C58485gu.m89846n("googleadservices");

    /* renamed from: d */
    private static final C58485gu f20029d = C58485gu.m89846n("google");

    /* renamed from: a */
    public static final String m18015a(Map map, Uri uri) {
        C58833ax axVar;
        String str;
        String uri2 = uri.toString();
        if (map.isEmpty()) {
            return uri2;
        }
        Matcher matcher = f20027b.matcher(uri2);
        if (matcher.find()) {
            axVar = C58833ax.m90834k(Integer.valueOf(matcher.start()));
        } else {
            axVar = C58836b.f156633a;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((C58495hd) map).entrySet().iterator();
        boolean z = true;
        while (true) {
            str = "&";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!z) {
                sb.append(str);
            }
            C6703a aVar = C6703a.REQUEST_SENDER_INFO_KEY;
            sb.append(((C6703a) entry.getKey()).f20019f);
            sb.append("=");
            sb.append((String) entry.getValue());
            z = false;
        }
        if (axVar.mo56113h()) {
            String substring = uri2.substring(0, ((Integer) axVar.mo56107c()).intValue() + 1);
            String substring2 = uri2.substring(((Integer) axVar.mo56107c()).intValue() + 1);
            String obj = sb.toString();
            return substring + obj + str + substring2;
        }
        if (true == uri2.endsWith(str)) {
            str = BuildConfig.FLAVOR;
        }
        String obj2 = sb.toString();
        return uri2 + str + obj2;
    }

    /* renamed from: b */
    public static final boolean m18016b(Uri uri) {
        return m18018d(uri) && "1".equals(uri.getQueryParameter(C6703a.SONIC_ENABLED_KEY.f20019f)) && !C58837ba.m90859h(uri.getQueryParameter(C6703a.SONIC_V3_ENDPOINT_KEY.f20019f));
    }

    /* renamed from: c */
    public static final boolean m18017c(Uri uri) {
        return m18018d(uri) && "2".equals(uri.getQueryParameter(C6703a.SONIC_ENABLED_KEY.f20019f));
    }

    /* renamed from: d */
    private static final boolean m18018d(Uri uri) {
        String host = uri.getHost();
        if (!C58837ba.m90859h(host)) {
            List asList = Arrays.asList(host.split("[.]", -1));
            if (asList.size() > 1 && ((String) asList.get(0)).equals("www")) {
                asList = asList.subList(1, asList.size());
            }
            if ((asList.size() == 2 && f20028c.contains(asList.get(0)) && ((String) asList.get(1)).equals("com")) || ((asList.size() == 2 || asList.size() == 3) && f20029d.contains(asList.get(0)) && (asList.size() != 2 ? !(asList.size() != 3 || ((!((String) asList.get(1)).equals("co") && !((String) asList.get(1)).equals("com")) || ((String) asList.get(2)).length() != 2)) : ((String) asList.get(1)).equals("com")))) {
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.isEmpty() || !((String) C58557jl.m90131l(pathSegments)).equals("aclk")) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
