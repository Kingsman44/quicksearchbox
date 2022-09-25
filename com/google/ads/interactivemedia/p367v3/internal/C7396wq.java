package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.ads.interactivemedia.v3.internal.wq */
/* compiled from: PG */
final class C7396wq implements adc {

    /* renamed from: a */
    private static final Pattern f24203a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    /* renamed from: b */
    public static final Long m22294b(InputStream inputStream) {
        String str;
        String readLine = new BufferedReader(new InputStreamReader(inputStream, apv.f21364b)).readLine();
        try {
            Matcher matcher = f24203a.matcher(readLine);
            if (!matcher.matches()) {
                String valueOf = String.valueOf(readLine);
                if (valueOf.length() != 0) {
                    str = "Couldn't parse timestamp: ".concat(valueOf);
                } else {
                    str = new String("Couldn't parse timestamp: ");
                }
                throw new C6886dt(str);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = true != "+".equals(matcher.group(4)) ? -1 : 1;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= j * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw new C6886dt((Throwable) e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14477a(Uri uri, InputStream inputStream) {
        return m22294b(inputStream);
    }
}
