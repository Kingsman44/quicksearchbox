package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.p4152bb.p4153a.C55126gv;
import com.google.p4152bb.p4153a.C55128gx;
import com.google.p4152bb.p4153a.C55129gy;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55401r;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

/* compiled from: PG */
public abstract class AbsoluteTimeArgument extends SingleValueArgument {
    protected AbsoluteTimeArgument(SingleValueArgument singleValueArgument, Object obj, int i) {
        super(singleValueArgument, obj, i);
    }

    /* renamed from: a */
    public abstract long mo81248a();

    /* renamed from: b */
    public abstract long mo81249b(C55401r rVar);

    /* renamed from: c */
    public C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        int i;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(mo81248a());
        C55133hb hbVar = C55133hb.NONE;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        int ordinal = a.ordinal();
        if (ordinal == 37) {
            return new C87429c(mo81248a());
        }
        switch (ordinal) {
            case 32:
                return new C87429c(instance.get(11));
            case 33:
                return new C87429c(instance.get(12));
            case 34:
                C55129gy gyVar = hcVar.f145128h;
                if (gyVar == null) {
                    gyVar = C55129gy.f145067c;
                }
                DateFormat dateFormat = null;
                if (gyVar != null) {
                    int a2 = C55128gx.m87599a(gyVar.f145070b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i2 = a2 - 1;
                    if (i2 == 1) {
                        i = 3;
                    } else if (i2 == 2) {
                        i = 2;
                    } else if (i2 == 3) {
                        i = 1;
                    } else if (i2 == 4) {
                        i = 0;
                    }
                    int a3 = C55126gv.m87598a(gyVar.f145069a);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i3 = a3 - 1;
                    if (i3 == 1) {
                        dateFormat = DateFormat.getDateInstance(i);
                    } else if (i3 == 2) {
                        dateFormat = DateFormat.getTimeInstance(i);
                    } else if (i3 == 3) {
                        dateFormat = DateFormat.getDateTimeInstance(i, i);
                    }
                }
                if (dateFormat == null) {
                    return C87429c.f236122a;
                }
                return new C87429c(dateFormat.format(instance.getTime()));
            default:
                return C87429c.f236122a;
        }
    }

    /* renamed from: d */
    public abstract C55296nc mo81251d();

    /* renamed from: e */
    public abstract List mo81252e();

    /* renamed from: f */
    public abstract void mo81253f(C55296nc ncVar);

    /* renamed from: g */
    public abstract boolean mo81254g();

    /* renamed from: h */
    public abstract boolean mo81255h();

    /* renamed from: i */
    public abstract boolean mo81256i();

    protected AbsoluteTimeArgument(C55213ka kaVar, Object obj) {
        super(kaVar, obj);
    }
}
