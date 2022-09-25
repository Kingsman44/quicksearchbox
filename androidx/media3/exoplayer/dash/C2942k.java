package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C2599az;
import androidx.media3.exoplayer.p151k.C3258x;
import com.google.common.base.C58913w;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.DesugarTimeZone;

/* renamed from: androidx.media3.exoplayer.dash.k */
/* compiled from: PG */
final class C2942k implements C3258x {

    /* renamed from: a */
    private static final Pattern f8449a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    /* renamed from: b */
    public static final Long m8317b(InputStream inputStream) {
        String readLine = new BufferedReader(new InputStreamReader(inputStream, C58913w.f156754c)).readLine();
        try {
            Matcher matcher = f8449a.matcher(readLine);
            if (matcher.matches()) {
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
            }
            throw C2599az.m6821c("Couldn't parse timestamp: " + readLine, (Throwable) null);
        } catch (ParseException e) {
            throw C2599az.m6821c((String) null, e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6768a(Uri uri, InputStream inputStream) {
        return m8317b(inputStream);
    }
}
