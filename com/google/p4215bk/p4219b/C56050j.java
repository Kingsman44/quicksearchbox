package com.google.p4215bk.p4219b;

import java.util.regex.Pattern;

/* renamed from: com.google.bk.b.j */
/* compiled from: PG */
public final class C56050j {

    /* renamed from: a */
    private static final Pattern f149357a = Pattern.compile(String.format("^%s", new Object[]{"((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z]|-testonly)?\\.((ggpht)|(googleusercontent)|(google)|(sandbox\\.google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|(ccp-lh\\.googleusercontent)|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(play-(ti-)?lh\\.googleusercontent)|(gz0\\.googleusercontent)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|(photos\\-image\\-(dev|qa)(-auth)?\\.corp\\.google\\.com)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-(dev|qa)\\-lighthouse(-auth)?\\.sandbox\\.google\\.com(\\/image)?))\\/"}));

    static {
        Pattern.compile(String.format("(%s[%s]*)", new Object[]{"((http(s)?):)?\\/\\/((((lh[3-6](-tt|-d[a-g,z]|-testonly)?\\.((ggpht)|(googleusercontent)|(google)|(sandbox\\.google)))|(([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))|(ccp-lh\\.googleusercontent)|((((cp|ci|gp)[3-6])|(ap[1-2]))\\.(ggpht|googleusercontent))|(gm[1-4]\\.ggpht)|(play-(ti-)?lh\\.googleusercontent)|(gz0\\.googleusercontent)|(((yt[3-4])|(sp[1-3]))\\.(ggpht|googleusercontent)))\\.com)|(dp[3-6]\\.googleusercontent\\.cn)|(lh[3-6]\\.(googleadsserving\\.cn|xn--9kr7l\\.com))|(photos\\-image\\-(dev|qa)(-auth)?\\.corp\\.google\\.com)|((dev|dev2|dev3|qa|qa2|qa3|qa-red|qa-blue|canary)[-.]lighthouse\\.sandbox\\.google\\.com\\/image)|(image\\-(dev|qa)\\-lighthouse(-auth)?\\.sandbox\\.google\\.com(\\/image)?))\\/", "a-zA-Z0-9_.~?#:&%=\\-\\/"}));
    }

    /* renamed from: a */
    public static boolean m87890a(String str) {
        if (str != null) {
            return f149357a.matcher(str).find();
        }
        throw new IllegalArgumentException();
    }
}
