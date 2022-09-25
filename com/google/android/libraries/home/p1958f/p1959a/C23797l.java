package com.google.android.libraries.home.p1958f.p1959a;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import com.google.assistant.p3861at.C50181no;
import java.util.ArrayList;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.f.a.l */
/* compiled from: PG */
public final class C23797l extends C23791f {
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        C69664n.m101060f(requireArguments, "requireArguments()");
        C50181no a = C23787b.m44306a(requireArguments);
        C0391l lVar = new C0391l(requireActivity());
        lVar.setTitle(a.f130447b);
        int[] a2 = C23795j.m44329a();
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        while (i < 2) {
            int i2 = a2[i];
            if (i2 != 0) {
                arrayList.add(getString(i2));
                i++;
            } else {
                throw null;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        C69664n.m101059e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        lVar.mo1294a((CharSequence[]) array, new C23796k(a, this));
        C0392m create = lVar.create();
        C69664n.m101060f(create, "override fun onCreateDia…    }\n      .create()\n  }");
        return create;
    }
}
