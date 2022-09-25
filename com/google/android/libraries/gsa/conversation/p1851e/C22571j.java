package com.google.android.libraries.gsa.conversation.p1851e;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58824ao;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.google.android.libraries.gsa.conversation.e.j */
/* compiled from: PG */
public final class C22571j {

    /* renamed from: a */
    public final C22565d f62205a;

    /* renamed from: b */
    public final C22563b f62206b;

    static {
        new C22570i();
    }

    public C22571j(C22565d dVar, C22563b bVar) {
        this.f62205a = dVar;
        this.f62206b = bVar;
    }

    /* renamed from: a */
    public final C22571j mo27658a(C52078ek ekVar) {
        C51805du duVar;
        String str;
        C52070ec ecVar;
        C22565d dVar = this.f62205a;
        if (ekVar.f136674b == 5) {
            duVar = (C51805du) ekVar.f136675c;
        } else {
            duVar = C51805du.f135924e;
        }
        String str2 = null;
        if ((duVar.f135926a & 1) != 0) {
            str = String.format("client_input: %s", new Object[]{duVar.f135927b});
        } else {
            str = null;
        }
        if (ekVar.f136674b == 3) {
            ecVar = (C52070ec) ekVar.f136675c;
        } else {
            ecVar = C52070ec.f136651d;
        }
        if ((ecVar.f136653a & 1) != 0) {
            Object[] objArr = new Object[1];
            C52236kg kgVar = ecVar.f136654b;
            if (kgVar == null) {
                kgVar = C52236kg.f137089d;
            }
            C52235kf a = C52235kf.m86549a(kgVar.f137092b);
            if (a == null) {
                a = C52235kf.OK;
            }
            objArr[0] = a.name();
            str2 = String.format("client_op_result: code(%s)", objArr);
        }
        C58827ar arVar = new C58827ar("\n");
        return new C22571j(dVar.mo27655a(new C58824ao(arVar, arVar).mo56097d(new C58825ap(new Object[]{mo27660c()}, str, str2)), "CCL"), this.f62206b);
    }

    /* renamed from: b */
    public final C22571j mo27659b(C52081en enVar) {
        return new C22571j(this.f62205a.mo27655a(mo27661d(enVar), "CCL"), this.f62206b);
    }

    /* renamed from: c */
    public final String mo27660c() {
        return new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    /* renamed from: d */
    public final String mo27661d(C52081en enVar) {
        Object[] objArr = new Object[4];
        objArr[0] = BuildConfig.FLAVOR;
        objArr[1] = Integer.valueOf(enVar.f136684d.size());
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        objArr[2] = Integer.valueOf(exVar.f136712a.size());
        objArr[3] = mo27660c();
        return String.format("&Delta;%s\n%s interactions; %s params\n%s", objArr);
    }
}
