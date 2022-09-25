package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.common.p4522b.C58466gb;
import com.google.common.p4522b.C58468gd;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bo */
/* compiled from: PG */
public final class C124089bo {

    /* renamed from: a */
    private static final C59071e f342726a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.i.bo");

    /* renamed from: b */
    private static final C58468gd f342727b;

    static {
        C58466gb gbVar = new C58466gb();
        gbVar.mo55364d(1, 7);
        gbVar.mo55364d(18, 11);
        gbVar.mo55364d(4, 2);
        gbVar.mo55364d(100, 27);
        gbVar.mo55364d(101, 28);
        gbVar.mo55364d(112, 35);
        gbVar.mo55364d(106, 30);
        gbVar.mo55364d(7, 3);
        gbVar.mo55364d(9, 118);
        gbVar.mo55364d(110, 119);
        gbVar.mo55364d(77, 24);
        gbVar.mo55364d(100003, 17);
        gbVar.mo55364d(100002, 16);
        gbVar.mo55364d(100001, 25);
        gbVar.mo55364d(100013, 41);
        gbVar.mo55364d(100006, 32);
        gbVar.mo55364d(100005, 31);
        gbVar.mo55364d(100007, 33);
        gbVar.mo55364d(100008, 9);
        gbVar.mo55364d(100009, 37);
        gbVar.mo55364d(100010, 38);
        gbVar.mo55364d(100011, 39);
        gbVar.mo55364d(100012, 40);
        f342727b = gbVar.mo55363c();
    }

    /* renamed from: a */
    public static Integer m203513a(Integer num) {
        Integer num2 = (Integer) ((C58723pp) f342727b).f156468c.get(num);
        if (num2 != null) {
            return num2;
        }
        C59104x d = f342726a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.DataTypeConverter");
        ((C59052c) ((C59052c) d).mo56372aa(35399)).mo56389s("#getDataTypeEnum(): Could not convert %d. Returning proactiveDataType.", num);
        return num;
    }

    /* renamed from: b */
    public static Integer m203514b(Integer num) {
        Integer num2 = (Integer) f342727b.get(num);
        if (num2 != null) {
            return num2;
        }
        C59104x d = f342726a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.DataTypeConverter");
        ((C59052c) ((C59052c) d).mo56372aa(35400)).mo56389s("#getProactiveDataType(): Could not convert %d. Returning dataType.", num);
        return num;
    }
}
