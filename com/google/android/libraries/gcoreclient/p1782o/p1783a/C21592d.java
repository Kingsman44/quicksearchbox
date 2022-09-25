package com.google.android.libraries.gcoreclient.p1782o.p1783a;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.accl.performers.C92980cc;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h;
import com.google.android.libraries.gcoreclient.p1782o.C21588a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.o.a.d */
/* compiled from: PG */
public final class C21592d extends C21589a {
    public C21592d(String str) {
        super(str);
    }

    /* renamed from: b */
    static GoogleHelp m40710b(String str, C21588a aVar) {
        Constructor constructor;
        Constructor[] declaredConstructors = GoogleHelp.class.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                constructor = null;
                break;
            }
            constructor = declaredConstructors[i];
            if (constructor.getParameterTypes().length == 32) {
                break;
            }
            i++;
        }
        if (constructor != null) {
            constructor.setAccessible(true);
            try {
                Object[] objArr = new Object[32];
                objArr[0] = 13;
                objArr[1] = str;
                objArr[2] = null;
                List list = ((C92980cc) aVar).f259373a;
                int size = list.size();
                Bundle bundle = new Bundle(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Pair pair = (Pair) list.get(i2);
                    bundle.putString((String) pair.first, (String) pair.second);
                }
                objArr[3] = bundle;
                objArr[4] = null;
                objArr[5] = null;
                objArr[6] = null;
                objArr[7] = true;
                objArr[8] = true;
                objArr[9] = new ArrayList();
                objArr[10] = null;
                objArr[11] = null;
                objArr[12] = null;
                objArr[13] = 0;
                objArr[14] = 0;
                objArr[15] = null;
                objArr[16] = null;
                objArr[17] = new ArrayList();
                objArr[18] = 0;
                objArr[19] = null;
                objArr[20] = new ArrayList();
                objArr[21] = false;
                objArr[22] = new ErrorReport();
                objArr[23] = null;
                objArr[24] = 0;
                objArr[25] = null;
                objArr[26] = -1;
                objArr[27] = false;
                objArr[28] = false;
                objArr[29] = 200;
                objArr[30] = null;
                objArr[31] = false;
                return (GoogleHelp) constructor.newInstance(objArr);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new IllegalStateException("expected GoogleHelp constructor is not invokable", e);
            }
        } else {
            throw new IllegalStateException("expected GoogleHelp constructor is not present");
        }
    }

    /* renamed from: a */
    public final void mo27019a(C21573h hVar) {
        this.f59965a.f390769s = hVar.f59959a;
    }

    @Deprecated
    public C21592d(String str, C21588a aVar) {
        super(str);
        this.f59965a = m40710b(str, aVar);
    }
}
