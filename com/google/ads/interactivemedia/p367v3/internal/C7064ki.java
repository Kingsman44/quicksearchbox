package com.google.ads.interactivemedia.p367v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ki */
/* compiled from: PG */
public final class C7064ki {

    /* renamed from: c */
    private static final Pattern f22616c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f22617a = -1;

    /* renamed from: b */
    public int f22618b = -1;

    /* renamed from: c */
    private final boolean m20959c(String str) {
        Matcher matcher = f22616c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = aeu.f20466a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f22617a = parseInt;
            this.f22618b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo16123a() {
        return (this.f22617a == -1 || this.f22618b == -1) ? false : true;
    }

    /* renamed from: b */
    public final void mo16124b(C7243qz qzVar) {
        for (int i = 0; i < qzVar.mo16341a(); i++) {
            C7242qy b = qzVar.mo16342b(i);
            if (b instanceof C7265ru) {
                C7265ru ruVar = (C7265ru) b;
                if ("iTunSMPB".equals(ruVar.f23723b) && m20959c(ruVar.f23724c)) {
                    return;
                }
            } else if (b instanceof C7275sd) {
                C7275sd sdVar = (C7275sd) b;
                if ("com.apple.iTunes".equals(sdVar.f23740a) && "iTunSMPB".equals(sdVar.f23741b) && m20959c(sdVar.f23742c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
