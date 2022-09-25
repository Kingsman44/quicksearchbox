package com.google.android.apps.gsa.staticplugins.actions.modularanswer;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55093fp;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.modularanswer.b */
/* compiled from: PG */
public final /* synthetic */ class C93408b implements C58817ah {
    public final Object apply(Object obj) {
        C55093fp fpVar = (C55093fp) obj;
        String str = fpVar.f144968b;
        if (!str.isEmpty()) {
            return str;
        }
        for (C55082fe feVar : fpVar.f144969c) {
            Iterator it = feVar.f144921h.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = ((C55073ew) it.next()).f144883b;
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                }
            }
        }
        ((C59052c) ((C59052c) ModularAnswerImpl.f260514f.mo56226d()).mo56372aa(13580)).mo56386p("Couldn't find something to show as a name of a person.");
        return BuildConfig.FLAVOR;
    }
}
