package com.google.android.libraries.gsa.conversation.clientop.p1846f;

import android.app.KeyguardManager;
import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.p1855h.C22692ae;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C52407qp;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.f.ai */
/* compiled from: PG */
public final class C22468ai {

    /* renamed from: a */
    public static final C59071e f62031a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.f.ai");

    /* renamed from: b */
    public final C22695ah f62032b;

    /* renamed from: c */
    public final C68214a f62033c;

    /* renamed from: d */
    public final KeyguardManager f62034d;

    /* renamed from: e */
    public final C22692ae f62035e;

    public C22468ai(C22695ah ahVar, C68214a aVar, Context context, C22692ae aeVar) {
        this.f62032b = ahVar;
        this.f62033c = aVar;
        this.f62034d = (KeyguardManager) context.getSystemService("keyguard");
        this.f62035e = aeVar;
    }

    /* renamed from: a */
    public static Uri.Builder m41913a(C51594nm nmVar, Uri.Builder builder) {
        return builder.appendQueryParameter("action", Uri.parse("/timer").buildUpon().appendPath(Integer.toString(C22481m.m41932a(((C51592nk) nmVar.f134477b.get(0)).f134467d))).appendPath("view").build().toString());
    }

    /* renamed from: b */
    public static void m41914b(Uri.Builder builder, C51592nk nkVar) {
        String str;
        builder.appendPath("edit");
        if ((nkVar.f134464a & 32) != 0) {
            builder.appendQueryParameter("message", nkVar.f134470g);
        }
        int i = nkVar.f134464a;
        if (!((i & 2) == 0 || nkVar.f134465b != 4 || (i & 4) == 0)) {
            C51591nj a = C51591nj.m86227a(nkVar.f134468e);
            if (a == null) {
                a = C51591nj.UNKNOWN_TIMER_STATUS;
            }
            if (a == C51591nj.PAUSED) {
                if ((nkVar.f134465b == 4 ? ((Long) nkVar.f134466c).longValue() : 0) == nkVar.f134469f) {
                    builder.appendQueryParameter("timerStatus", "Reset");
                    return;
                }
            }
        }
        int i2 = nkVar.f134465b;
        if (i2 == 4) {
            builder.appendQueryParameter("remainingTime", m41915c(((Long) nkVar.f134466c).longValue()));
        } else if (i2 == 5 && (nkVar.f134464a & 128) != 0) {
            long longValue = ((Long) nkVar.f134466c).longValue();
            C52407qp qpVar = nkVar.f134471h;
            if (qpVar == null) {
                qpVar = C52407qp.f137523d;
            }
            long j = qpVar.f137526b * 1000;
            C52407qp qpVar2 = nkVar.f134471h;
            if (qpVar2 == null) {
                qpVar2 = C52407qp.f137523d;
            }
            builder.appendQueryParameter("remainingTime", m41915c(longValue - (j + (((long) qpVar2.f137527c) / 1000000))));
        }
        if ((nkVar.f134464a & 2) != 0) {
            C51591nj a2 = C51591nj.m86227a(nkVar.f134468e);
            if (a2 == null) {
                a2 = C51591nj.UNKNOWN_TIMER_STATUS;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                str = "Started";
            } else if (ordinal == 2) {
                str = "Paused";
            } else {
                throw new IllegalArgumentException("can only update the Timer to PAUSED or RUNNING status, but got: ".concat(String.valueOf(a2.name())));
            }
            builder.appendQueryParameter("timerStatus", str);
        }
    }

    /* renamed from: c */
    private static String m41915c(long j) {
        return "PT" + (j / 1000) + "." + (j % 1000) + "S";
    }
}
