package org.chromium.base;

import android.util.Printer;
import com.evernote.android.state.BuildConfig;
import p000J.C0000N;

/* renamed from: org.chromium.base.w */
/* compiled from: PG */
class C72410w implements Printer {

    /* renamed from: a */
    private String f192586a;

    /* renamed from: a */
    public void mo63875a(String str) {
        String str2;
        int i;
        int i2;
        int i3 = EarlyTraceEvent.f192491a;
        if (TraceEvent.f192510a) {
            if (TraceEvent.f192512c) {
                str2 = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                int indexOf = str.indexOf(40, 18);
                if (indexOf == -1) {
                    i = -1;
                } else {
                    i = str.indexOf(41, indexOf);
                }
                String str3 = BuildConfig.FLAVOR;
                String substring = i != -1 ? str.substring(indexOf + 1, i) : str3;
                int indexOf2 = str.indexOf(125, 18);
                if (indexOf2 == -1) {
                    i2 = -1;
                } else {
                    i2 = str.indexOf(58, indexOf2);
                }
                if (i2 == -1) {
                    i2 = str.length();
                }
                if (indexOf2 != -1) {
                    str3 = str.substring(indexOf2 + 2, i2);
                }
                str2 = "Looper.dispatch: " + substring + "(" + str3 + ")";
            }
            this.f192586a = str2;
            if (TraceEvent.f192510a) {
                C0000N.M_y76mct(this.f192586a);
            } else {
                int i4 = EarlyTraceEvent.f192491a;
            }
        }
    }

    /* renamed from: b */
    public void mo63876b(String str) {
        int i = EarlyTraceEvent.f192491a;
        if (TraceEvent.f192510a && this.f192586a != null) {
            if (TraceEvent.f192510a) {
                C0000N.MLJecZJ9(this.f192586a);
            } else {
                int i2 = EarlyTraceEvent.f192491a;
            }
        }
        this.f192586a = null;
    }

    public final void println(String str) {
        if (str.startsWith(">")) {
            mo63875a(str);
        } else {
            mo63876b(str);
        }
    }
}
