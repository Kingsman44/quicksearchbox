package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a;

import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.C13928e;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.c.a.a */
/* compiled from: PG */
public final class C13923a {

    /* renamed from: a */
    private final C13928e f42395a;

    public C13923a(C13928e eVar) {
        this.f42395a = eVar;
    }

    /* renamed from: a */
    public final void mo21354a(String str) {
        C37257f d = m30203d(str);
        if (d != null) {
            this.f42395a.mo21357a(d.mo40805c(C62722b.OK), Optional.empty(), Optional.empty());
        }
    }

    /* renamed from: b */
    public final void mo21355b(String str, C52179id idVar) {
        C62722b bVar;
        C37257f d = m30203d(str);
        if (d != null && idVar != null) {
            C13928e eVar = this.f42395a;
            switch (idVar.f136953B) {
                case 1:
                case 16:
                    bVar = C62722b.INVALID_ARGUMENT;
                    break;
                case 2:
                case 13:
                case 15:
                case 19:
                case 23:
                    bVar = C62722b.UNIMPLEMENTED;
                    break;
                case 3:
                    bVar = C62722b.UNAUTHENTICATED;
                    break;
                case 4:
                    bVar = C62722b.PERMISSION_DENIED;
                    break;
                case 5:
                    bVar = C62722b.RESOURCE_EXHAUSTED;
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 11:
                case 12:
                case 20:
                case 21:
                case 22:
                    bVar = C62722b.OK;
                    break;
                case 10:
                    bVar = C62722b.CANCELLED;
                    break;
                case 14:
                case 18:
                    bVar = C62722b.UNAVAILABLE;
                    break;
                case 17:
                    bVar = C62722b.NOT_FOUND;
                    break;
                case 25:
                    bVar = C62722b.FAILED_PRECONDITION;
                    break;
                case 26:
                    bVar = C62722b.INTERNAL;
                    break;
                default:
                    bVar = C62722b.UNKNOWN;
                    break;
            }
            eVar.mo21357a(d.mo40805c(bVar), Optional.m71637of(idVar), Optional.empty());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.libraries.search.p2871b.p2895i.C37257f m30203d(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1431171252: goto L_0x0034;
                case -1355740809: goto L_0x002a;
                case -26624189: goto L_0x0020;
                case 1893440189: goto L_0x0016;
                case 1893603276: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "media.STOP"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 1
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "media.NEXT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 2
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "media.PLAY_MEDIA"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "media.RESUME"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 4
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "media.PAUSE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == 0) goto L_0x0057
            if (r5 == r4) goto L_0x0054
            if (r5 == r3) goto L_0x0051
            if (r5 == r2) goto L_0x004e
            if (r5 == r1) goto L_0x004b
            r5 = 0
            return r5
        L_0x004b:
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97659ea
            return r5
        L_0x004e:
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97610dW
            return r5
        L_0x0051:
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97611dX
            return r5
        L_0x0054:
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97613dZ
            return r5
        L_0x0057:
            com.google.android.libraries.search.b.i.f r5 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97612dY
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c.p1045a.C13923a.m30203d(java.lang.String):com.google.android.libraries.search.b.i.f");
    }

    /* renamed from: c */
    public final void mo21356c(PlaybackStateCompat playbackStateCompat) {
        C37258g gVar;
        C13928e eVar = this.f42395a;
        switch (playbackStateCompat.f994a) {
            case 1:
                gVar = C37179a.f97599dL;
                break;
            case 2:
                gVar = C37179a.f97600dM;
                break;
            case 3:
                gVar = C37179a.f97601dN;
                break;
            case 4:
                gVar = C37179a.f97602dO;
                break;
            case 5:
                gVar = C37179a.f97603dP;
                break;
            case 6:
                gVar = C37179a.f97604dQ;
                break;
            case 7:
                gVar = C37179a.f97605dR;
                break;
            case 8:
                gVar = C37179a.f97606dS;
                break;
            case 9:
                gVar = C37179a.f97607dT;
                break;
            case 10:
                gVar = C37179a.f97608dU;
                break;
            case 11:
                gVar = C37179a.f97609dV;
                break;
            default:
                gVar = C37179a.f97598dK;
                break;
        }
        eVar.mo21357a(gVar.mo40779c(), Optional.empty(), Optional.empty());
    }
}
