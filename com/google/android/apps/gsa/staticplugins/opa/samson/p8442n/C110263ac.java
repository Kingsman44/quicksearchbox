package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3886c.C50802cz;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50719d;
import com.google.assistant.p3886c.p3888b.C50720e;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.ac */
/* compiled from: PG */
public final class C110263ac {

    /* renamed from: a */
    public static final C59071e f307283a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.n.ac");

    /* renamed from: b */
    private final C21370a f307284b;

    /* renamed from: c */
    private final Context f307285c;

    public C110263ac(C21370a aVar, Context context) {
        this.f307284b = aVar;
        this.f307285c = context;
    }

    /* renamed from: a */
    public final Intent mo98507a(C50818do doVar) {
        if ((doVar.f132304a & 2048) != 0) {
            C50733r rVar = doVar.f132316m;
            if (rVar == null) {
                rVar = C50733r.f132021d;
            }
            String str = rVar.f132025c;
            if (!TextUtils.isEmpty(str)) {
                try {
                    Intent parseUri = Intent.parseUri(str, 0);
                    C50733r rVar2 = doVar.f132316m;
                    if (rVar2 == null) {
                        rVar2 = C50733r.f132021d;
                    }
                    C50731p a = C50731p.m85907a(rVar2.f132024b);
                    if (a == null) {
                        a = C50731p.UNDEFINED;
                    }
                    C92122r.m151193o(parseUri, a);
                    return parseUri;
                } catch (URISyntaxException e) {
                    C59104x c = f307283a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "SmspCardPrPrsr");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25965)).mo56389s("Bad intent URI: %s", str);
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final C50802cz mo98508b(C50818do doVar) {
        long b = this.f307284b.mo26870b();
        long j = doVar.f132318o;
        long j2 = doVar.f132319p + j;
        if (b < j) {
            if ((doVar.f132304a & 8) != 0) {
                C50802cz czVar = doVar.f132308e;
                if (czVar == null) {
                    return C50802cz.f132236g;
                }
                return czVar;
            }
            C50802cz czVar2 = doVar.f132311h;
            if (czVar2 == null) {
                return C50802cz.f132236g;
            }
            return czVar2;
        } else if (b < j || b >= j2) {
            if ((doVar.f132304a & 32) != 0) {
                C50802cz czVar3 = doVar.f132310g;
                if (czVar3 == null) {
                    return C50802cz.f132236g;
                }
                return czVar3;
            }
            C50802cz czVar4 = doVar.f132313j;
            return czVar4 == null ? C50802cz.f132236g : czVar4;
        } else if ((doVar.f132304a & 16) != 0) {
            C50802cz czVar5 = doVar.f132309f;
            if (czVar5 == null) {
                return C50802cz.f132236g;
            }
            return czVar5;
        } else {
            C50802cz czVar6 = doVar.f132312i;
            if (czVar6 == null) {
                return C50802cz.f132236g;
            }
            return czVar6;
        }
    }

    /* renamed from: c */
    public final String mo98509c(C50723h hVar, C50818do doVar) {
        int i;
        long j;
        String str;
        C50723h hVar2 = hVar;
        C50818do doVar2 = doVar;
        if (hVar2 == null || (i = hVar2.f132001a & 1) == 0) {
            return BuildConfig.FLAVOR;
        }
        String str2 = hVar2.f132002b;
        if (i == 0 || hVar2.f132004d.size() == 0) {
            return str2;
        }
        C62971cq cqVar = hVar2.f132004d;
        int size = cqVar.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            C50720e eVar = (C50720e) cqVar.get(i2);
            C50719d dVar = C50719d.UNDEFINED;
            C50719d a = C50719d.m85891a(eVar.f131990d);
            if (a == null) {
                a = C50719d.UNDEFINED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                C50719d a2 = C50719d.m85891a(eVar.f131990d);
                if (a2 == null) {
                    a2 = C50719d.UNDEFINED;
                }
                if (a2 == C50719d.EVENT_END_TIME) {
                    j = doVar2.f132318o + doVar2.f132319p;
                } else {
                    j = doVar2.f132318o;
                }
                double abs = (double) Math.abs(this.f307284b.mo26870b() - j);
                Double.isNaN(abs);
                int ceil = (int) Math.ceil(abs / 60000.0d);
                if (ceil >= 60) {
                    int i3 = ceil / 60;
                    int i4 = ceil % 60;
                    str = this.f307285c.getResources().getQuantityString(R.plurals.amb_smartspace_hours, i3, new Object[]{Integer.valueOf(i3)});
                    if (i4 > 0) {
                        str = this.f307285c.getString(R.string.amb_smartspace_hours_mins, new Object[]{str, this.f307285c.getResources().getQuantityString(R.plurals.amb_smartspace_minutes, i4, new Object[]{Integer.valueOf(i4)})});
                    }
                } else {
                    str = this.f307285c.getResources().getQuantityString(R.plurals.amb_smartspace_minutes, ceil, new Object[]{Integer.valueOf(ceil)});
                }
                strArr[i2] = str;
            } else if (ordinal != 3) {
                strArr[i2] = BuildConfig.FLAVOR;
            } else {
                strArr[i2] = (eVar.f131987a & 1) != 0 ? eVar.f131988b : BuildConfig.FLAVOR;
            }
        }
        return String.format(str2, (Object[]) strArr);
    }
}
