package com.google.android.gms.learning.p10825e.p10826a;

import android.content.Context;
import com.google.android.gms.learning.p10820a.C144547dk;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import com.google.common.util.C60790c;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.learning.e.a.m */
/* compiled from: PG */
public final class C144750m {

    /* renamed from: a */
    private static final Pattern f391592a = Pattern.compile("/([a-zA-Z_.]+)/.+?");

    /* renamed from: a */
    public static File m235263a(Context context, String str) {
        return new File(m235265c(context, str));
    }

    /* renamed from: b */
    public static File m235264b(Context context, URI uri) {
        String scheme = uri.getScheme();
        if ("appdir".equals(scheme)) {
            return context.getDir(m235269g(uri.getPath())[0], 0);
        }
        if ("appfiles".equals(scheme)) {
            return context.getFilesDir();
        }
        if ("appcache".equals(scheme)) {
            return context.getCacheDir();
        }
        throw ErrorStatusException.m54793b(3, "Unsupported URI scheme: %s", scheme);
    }

    /* renamed from: c */
    public static String m235265c(Context context, String str) {
        URI e = m235267e(str);
        String path = m235264b(context, e).getPath();
        String scheme = e.getScheme();
        if ("appdir".equals(scheme)) {
            String[] g = m235269g(e.getPath());
            return C60790c.m92793a(path, C60790c.m92793a((String[]) Arrays.copyOfRange(g, 1, g.length)));
        } else if ("appfiles".equals(scheme) || "appcache".equals(scheme)) {
            return C60790c.m92793a(path, e.getPath());
        } else {
            throw ErrorStatusException.m54793b(3, "Unsupported URI scheme: %s", scheme);
        }
    }

    /* renamed from: d */
    public static String m235266d(String str) {
        Matcher matcher = f391592a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: e */
    public static URI m235267e(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            throw ErrorStatusException.m54792a(3, e);
        }
    }

    /* renamed from: f */
    public static void m235268f(File file) {
        if (!file.isDirectory()) {
            C144547dk.m234922a(file);
        }
        for (File file2 : file.listFiles()) {
            if (!file2.getName().equals("__brella__")) {
                C144547dk.m234922a(file2);
            }
        }
    }

    /* renamed from: g */
    private static String[] m235269g(String str) {
        if (str.startsWith("/")) {
            return str.substring(1).split("/");
        }
        throw ErrorStatusException.m54793b(3, "Path is not absolute.", new Object[0]);
    }
}
