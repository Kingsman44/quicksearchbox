package com.google.android.libraries.p1657ba.p1658a;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;

/* renamed from: com.google.android.libraries.ba.a.c */
/* compiled from: PG */
public final class C19641c {

    /* renamed from: a */
    public String f54642a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f54643b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C19635a f54644c = C19635a.OPEN;

    /* renamed from: d */
    public Boolean f54645d = false;

    /* renamed from: a */
    public static String m37469a(String str) {
        return "\"" + str + "\"";
    }

    /* renamed from: b */
    public static boolean m37470b(String str) {
        for (char c : str.toCharArray()) {
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    switch (c) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m37471c(String str, int i, int i2) {
        return str.length() >= i && str.length() <= i2;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("ssid", this.f54642a);
        b.mo56102b("password", this.f54643b);
        b.mo56102b("encryption", this.f54644c);
        return b.toString();
    }
}
