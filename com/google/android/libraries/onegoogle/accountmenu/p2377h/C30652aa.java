package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.LiveData;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30378bf;
import com.google.android.libraries.onegoogle.common.C30908ah;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.aa */
/* compiled from: PG */
public final class C30652aa extends LinearLayout {
    public C30652aa(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.choose_an_account_content, this);
        setOrientation(1);
    }

    /* renamed from: b */
    public static void m57302b(RecyclerView recyclerView, C0640fb fbVar) {
        recyclerView.getScrollingChildHelper().mo5279a(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        C30908ah.m57698a(recyclerView, fbVar);
    }

    /* renamed from: a */
    public final C30378bf mo36354a(LiveData liveData, int i, C30305n nVar, C30922i iVar) {
        Context context = getContext();
        C30306o i2 = nVar.mo35858i();
        if (liveData == null) {
            liveData = new C2332ag(C58485gu.m89845m());
        }
        return new C30378bf(context, i2, liveData, iVar, nVar.mo35864o(), i, nVar.mo35860k().mo36170c());
    }
}
