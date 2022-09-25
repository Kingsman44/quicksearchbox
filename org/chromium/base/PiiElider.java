package org.chromium.base;

import android.text.TextUtils;
import com.evernote.android.state.StateSaver;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
public class PiiElider {

    /* renamed from: a */
    private static final Pattern f192500a = Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯-]{0,61}[a-zA-Z0-9 -퟿豈-﷏ﷰ-￯]){0,1}\\.)+[a-zA-Z -퟿豈-﷏ﷰ-￯]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");

    /* renamed from: b */
    private static final Pattern f192501b = Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.|Caused by: java.lang.(ClassNotFoundException|NoClassDefFoundError):");

    /* renamed from: c */
    private static final String[] f192502c = {"org.chromium.", "com.google.", "com.chrome."};

    /* renamed from: d */
    private static final String[] f192503d = {StateSaver.ANDROID_PREFIX, "com.android.", "dalvik.", StateSaver.JAVA_PREFIX, "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};

    static {
        Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
    }

    /* renamed from: a */
    public static String m107024a(String str) {
        int lastIndexOf;
        if (f192501b.matcher(str).find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = f192500a.matcher(sb);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = sb.substring(start, end);
            String[] strArr = f192502c;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    String[] strArr2 = f192503d;
                    int length2 = strArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < 10) {
                            if (substring.startsWith(strArr2[i3])) {
                                break;
                            }
                            i3++;
                        } else if (!m107025b(substring) && ((lastIndexOf = substring.lastIndexOf(".")) == -1 || !m107025b(substring.substring(0, lastIndexOf)))) {
                            sb.replace(start, end, "HTTP://WEBADDRESS.ELIDED");
                            i = start + 24;
                            matcher = f192500a.matcher(sb);
                        }
                    }
                } else if (substring.startsWith(strArr[i2])) {
                    break;
                } else {
                    i2++;
                }
            }
            i = end;
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m107025b(String str) {
        try {
            Class.forName(str, false, C72382h.f192527a.getClassLoader());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String sanitizeStacktrace(String str) {
        String[] split = str.split("\\n");
        split[0] = m107024a(split[0]);
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("Caused by:")) {
                split[i] = m107024a(split[i]);
            }
        }
        return TextUtils.join("\n", split);
    }
}
