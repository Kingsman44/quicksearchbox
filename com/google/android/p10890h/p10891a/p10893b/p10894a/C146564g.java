package com.google.android.p10890h.p10891a.p10893b.p10894a;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.C2599az;
import androidx.media3.common.p136b.C2602aa;
import androidx.media3.exoplayer.p137a.C2711b;
import androidx.media3.exoplayer.p145h.C3027aj;
import androidx.media3.exoplayer.p145h.C3032ao;
import androidx.media3.exoplayer.p145h.C3044b;
import androidx.media3.p132b.C2484ac;
import androidx.media3.p132b.C2485ad;
import androidx.media3.p132b.C2486ae;
import androidx.media3.p132b.C2496ao;
import com.evernote.android.state.BuildConfig;
import com.google.android.p10890h.p10891a.p10893b.C146579j;
import com.google.android.p10890h.p10891a.p10893b.C146580k;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.h.a.b.a.g */
/* compiled from: PG */
public final class C146564g extends C146579j {

    /* renamed from: b */
    private static final Pattern f395810b = Pattern.compile("[\\.$]");

    /* renamed from: c */
    private final Context f395811c;

    /* renamed from: d */
    private IOException f395812d;

    /* renamed from: e */
    private boolean f395813e;

    /* renamed from: f */
    private int f395814f;

    public C146564g(Context context) {
        this.f395811c = context.getApplicationContext();
    }

    /* renamed from: u */
    private static String m238695u(String str) {
        if (str.contains("Error")) {
            str = str.replace("Error", "E");
        }
        return str.contains("Exception") ? str.replace("Exception", "E") : str;
    }

    /* renamed from: v */
    private static Throwable m238696v(Throwable th) {
        Throwable cause = th.getCause();
        return cause == null ? th : cause;
    }

    /* renamed from: w */
    private static void m238697w(StringBuilder sb, String str) {
        String[] split = f395810b.split(str);
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                sb.append('.');
            }
            sb.append(split[i], 0, Math.min(4, split[i].length()));
        }
    }

    /* renamed from: x */
    private static void m238698x(StringBuilder sb, Throwable th) {
        sb.append(m238695u(th.getClass().getSimpleName()));
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length != 0) {
            int i = 0;
            while (i < Math.min(3, stackTrace.length)) {
                sb.append(i == 0 ? '.' : '/');
                StackTraceElement stackTraceElement = stackTrace[i];
                m238697w(sb, stackTraceElement.getClassName());
                sb.append('.');
                m238697w(sb, stackTraceElement.getMethodName());
                sb.append('.');
                sb.append(stackTraceElement.getLineNumber());
                i++;
            }
        }
    }

    /* renamed from: y */
    private final void m238699y(C2711b bVar, IOException iOException, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        String str;
        String str2;
        IOException iOException2 = iOException;
        boolean z3 = z;
        boolean z4 = z2;
        int a = C2602aa.m6836b(this.f395811c).mo6114a();
        String str3 = "net.retryexhausted";
        if (iOException2 instanceof C2486ae) {
            C2486ae aeVar = (C2486ae) iOException2;
            if (true != z4) {
                str3 = "net.badstatus";
            }
            if (z3) {
                str3 = "manifest.".concat(str3);
            }
            i2 = aeVar.f6832d;
            str = str3;
            i3 = 1;
        } else {
            if ((iOException2 instanceof C2485ad) || (iOException2 instanceof C2599az)) {
                str2 = true != z3 ? "fmt.unparseable" : "manifest.unparseable";
            } else {
                boolean z5 = iOException2 instanceof C2484ac;
                if (z5 || (iOException2 instanceof C2496ao)) {
                    if (!z4) {
                        if (a == 1) {
                            str3 = "net.unavailable";
                        } else {
                            Throwable cause = iOException.getCause();
                            if (cause instanceof UnknownHostException) {
                                str3 = "net.dns";
                            } else if (cause instanceof SocketTimeoutException) {
                                str3 = "net.timeout";
                            } else {
                                str3 = (!z5 || ((C2484ac) iOException2).f6831c != 1) ? "net.closed" : "net.connect";
                            }
                        }
                    }
                    if (z3) {
                        str2 = "manifest.".concat(str3);
                    } else {
                        str = str3;
                        i3 = 0;
                        i2 = -1;
                    }
                } else {
                    str2 = iOException2 instanceof C3044b ? "qoe.livewindow" : true != z4 ? "player.exception" : "player.fatalexception";
                }
            }
            str = str2;
            i3 = 0;
            i2 = -1;
        }
        m238700z(bVar, str, (String) null, i3, i2, i, iOException);
        this.f395812d = iOException2;
        this.f395813e = z3;
        this.f395814f = i;
    }

    /* renamed from: z */
    private final void m238700z(C2711b bVar, String str, String str2, int i, int i2, int i3, Throwable th) {
        StringBuilder b = this.f395862a.mo123372b(bVar.f7527a);
        b.append(str);
        b.append(':');
        b.append(C146580k.m238793a(bVar.f7531e));
        b.append(':');
        if (i != 1) {
            b.append("exception.");
            m238698x(b, th);
            String message = th.getMessage();
            if (message != null) {
                String replaceAll = m238695u(message).replaceAll("[:,;]", BuildConfig.FLAVOR);
                if (replaceAll.length() > 100) {
                    replaceAll = replaceAll.substring(0, 100);
                }
                b.append(' ');
                b.append(replaceAll);
            }
            int i4 = 3;
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                i4--;
                if (i4 <= 0) {
                    break;
                }
                if (i4 == 2) {
                    b.append(";ncause.");
                } else {
                    b.append('-');
                }
                m238698x(b, cause);
            }
        } else {
            b.append("rc.");
            b.append(i2);
            i = 1;
        }
        if (str2 != null) {
            b.append(";src.");
            b.append(str2);
        }
        if (i == 2) {
            b.append(";ec.");
            b.append(i2);
        }
        if (i3 != -1) {
            b.append(";rn.");
            b.append(i3);
        }
        this.f395862a.mo123373c("error", Uri.encode(b.toString(), ",:"));
    }

    /* renamed from: c */
    public final void mo95069c() {
        this.f395862a.mo123374d("error");
    }

    /* renamed from: e */
    public final void mo123360e(C2711b bVar, int i, long j, long j2, boolean z) {
        if (z) {
            m238700z(bVar, "underrun", (String) null, 0, 0, -1, new Exception("underrun size=" + i + " ms=" + j + " elapsed=" + j2));
        }
    }

    /* JADX WARNING: type inference failed for: r13v7, types: [java.lang.Throwable] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123361j(androidx.media3.exoplayer.p137a.C2711b r12, androidx.media3.common.C2639ba r13, boolean r14) {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x00e2
            boolean r14 = r13 instanceof androidx.media3.exoplayer.C3267o
            r0 = 0
            if (r14 == 0) goto L_0x0032
            r1 = r13
            androidx.media3.exoplayer.o r1 = (androidx.media3.exoplayer.C3267o) r1
            int r1 = r1.f9812c
            if (r1 != 0) goto L_0x0032
            java.lang.Throwable r13 = r13.getCause()
            int r14 = androidx.media3.common.p136b.C2612ak.f7249a
            r3 = r13
            java.io.IOException r3 = (java.io.IOException) r3
            java.io.IOException r13 = r11.f395812d
            if (r13 != r3) goto L_0x0022
            boolean r14 = r11.f395813e
            if (r14 == 0) goto L_0x0022
            r0 = 1
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r13 != r3) goto L_0x0029
            int r13 = r11.f395814f
            r4 = r13
            goto L_0x002b
        L_0x0029:
            r13 = -1
            r4 = -1
        L_0x002b:
            r6 = 1
            r1 = r11
            r2 = r12
            r1.m238699y(r2, r3, r4, r5, r6)
            return
        L_0x0032:
            if (r14 == 0) goto L_0x0038
            java.lang.Throwable r13 = m238696v(r13)
        L_0x0038:
            boolean r14 = r13 instanceof androidx.media3.exoplayer.p139c.C2860c
            if (r14 == 0) goto L_0x0040
            java.lang.Throwable r13 = m238696v(r13)
        L_0x0040:
            boolean r14 = r13 instanceof androidx.media3.exoplayer.p142e.C2991u
            java.lang.String r1 = "fmt.decode"
            r2 = 0
            if (r14 == 0) goto L_0x0059
            r14 = r13
            androidx.media3.exoplayer.e.u r14 = (androidx.media3.exoplayer.p142e.C2991u) r14
            java.lang.String r14 = r14.f8598d
            int r14 = androidx.media3.common.p136b.C2612ak.m6987l(r14)
            if (r14 == 0) goto L_0x0056
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
        L_0x0056:
            java.lang.String r14 = "decinit"
            goto L_0x0080
        L_0x0059:
            int r14 = androidx.media3.common.p136b.C2612ak.f7249a
            boolean r14 = r13 instanceof android.media.MediaCodec.CryptoException
            if (r14 == 0) goto L_0x0071
            r14 = r13
            android.media.MediaCodec$CryptoException r14 = (android.media.MediaCodec.CryptoException) r14
            int r14 = r14.getErrorCode()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r1 = "drm.keyerror"
        L_0x006c:
            r10 = r13
            r5 = r1
            r6 = r2
            r2 = r14
            goto L_0x00cd
        L_0x0071:
            boolean r14 = r13 instanceof androidx.media3.exoplayer.p138b.C2822r
            if (r14 == 0) goto L_0x0084
            r14 = r13
            androidx.media3.exoplayer.b.r r14 = (androidx.media3.exoplayer.p138b.C2822r) r14
            int r14 = r14.f7872a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.String r14 = "audinit"
        L_0x0080:
            r10 = r13
            r6 = r14
            r5 = r1
            goto L_0x00cd
        L_0x0084:
            boolean r14 = r13 instanceof androidx.media3.exoplayer.p138b.C2824t
            if (r14 == 0) goto L_0x0094
            r14 = r13
            androidx.media3.exoplayer.b.t r14 = (androidx.media3.exoplayer.p138b.C2824t) r14
            int r14 = r14.f7875a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            java.lang.String r14 = "audwrite"
            goto L_0x0080
        L_0x0094:
            boolean r14 = r13 instanceof androidx.media3.exoplayer.p139c.C2871n
            if (r14 == 0) goto L_0x00a4
            r14 = r13
            androidx.media3.exoplayer.c.n r14 = (androidx.media3.exoplayer.p139c.C2871n) r14
            int r14 = r14.f8053a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r1 = "drm.unimplemented"
            goto L_0x006c
        L_0x00a4:
            boolean r14 = r13 instanceof androidx.media3.exoplayer.p142e.C2988r
            if (r14 == 0) goto L_0x00c1
            r14 = r13
            androidx.media3.exoplayer.e.r r14 = (androidx.media3.exoplayer.p142e.C2988r) r14
            java.lang.String r14 = r14.f8586a
            if (r14 == 0) goto L_0x00ba
            int r14 = androidx.media3.common.p136b.C2612ak.m6987l(r14)
            if (r14 == 0) goto L_0x00ba
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r2 = r14
        L_0x00ba:
            java.lang.Throwable r13 = m238696v(r13)
            java.lang.String r14 = "decfail"
            goto L_0x0080
        L_0x00c1:
            boolean r14 = r13 instanceof java.lang.OutOfMemoryError
            if (r14 == 0) goto L_0x00c8
            java.lang.String r1 = "player.outofmemory"
            goto L_0x00ca
        L_0x00c8:
            java.lang.String r1 = "player.fatalexception"
        L_0x00ca:
            r10 = r13
            r5 = r1
            r6 = r2
        L_0x00cd:
            if (r2 != 0) goto L_0x00d1
            r7 = 0
            goto L_0x00d3
        L_0x00d1:
            r13 = 2
            r7 = 2
        L_0x00d3:
            if (r2 != 0) goto L_0x00d7
            r8 = 0
            goto L_0x00dc
        L_0x00d7:
            int r0 = r2.intValue()
            r8 = r0
        L_0x00dc:
            r9 = -1
            r3 = r11
            r4 = r12
            r3.m238700z(r4, r5, r6, r7, r8, r9, r10)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10890h.p10891a.p10893b.p10894a.C146564g.mo123361j(androidx.media3.exoplayer.a.b, androidx.media3.common.ba, boolean):void");
    }

    /* renamed from: p */
    public final void mo123362p(C2711b bVar, C3027aj ajVar, C3032ao aoVar, IOException iOException, boolean z) {
        int i;
        String queryParameter;
        if (z) {
            boolean z2 = aoVar.f8795a == 4;
            Uri uri = ajVar.f8772b.f6891a;
            if (uri.isHierarchical() && (queryParameter = uri.getQueryParameter("rn")) != null) {
                try {
                    i = Integer.parseInt(queryParameter);
                } catch (NumberFormatException unused) {
                }
                m238699y(bVar, iOException, i, z2, false);
            }
            i = -1;
            m238699y(bVar, iOException, i, z2, false);
        }
    }
}
