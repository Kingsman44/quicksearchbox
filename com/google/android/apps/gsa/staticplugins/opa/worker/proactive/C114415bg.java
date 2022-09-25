package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Intent;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.ParcelableSyntheticTree;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.TreeNodeRef;
import com.google.android.libraries.search.assistant.proactive.C36231b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.ajz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bg */
/* compiled from: PG */
public final /* synthetic */ class C114415bg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114418bj f317245a;

    /* renamed from: b */
    public final /* synthetic */ ParcelableSyntheticTree f317246b;

    /* renamed from: c */
    public final /* synthetic */ TreeNodeRef f317247c;

    /* renamed from: d */
    public final /* synthetic */ ajz f317248d;

    /* renamed from: e */
    public final /* synthetic */ boolean f317249e;

    /* renamed from: f */
    public final /* synthetic */ Intent f317250f;

    /* renamed from: g */
    public final /* synthetic */ boolean f317251g;

    public /* synthetic */ C114415bg(C114418bj bjVar, ParcelableSyntheticTree parcelableSyntheticTree, TreeNodeRef treeNodeRef, ajz ajz, boolean z, Intent intent, boolean z2) {
        this.f317245a = bjVar;
        this.f317246b = parcelableSyntheticTree;
        this.f317247c = treeNodeRef;
        this.f317248d = ajz;
        this.f317249e = z;
        this.f317250f = intent;
        this.f317251g = z2;
    }

    public final C60870cx apply(Object obj) {
        ajz ajz;
        C114418bj bjVar = this.f317245a;
        ParcelableSyntheticTree parcelableSyntheticTree = this.f317246b;
        TreeNodeRef treeNodeRef = this.f317247c;
        ajz ajz2 = this.f317248d;
        boolean z = this.f317249e;
        Intent intent = this.f317250f;
        boolean z2 = this.f317251g;
        AccountId accountId = (AccountId) obj;
        C36231b bVar = bjVar.f317261g;
        if (ajz2 != null) {
            ajz = ajz2;
        } else {
            ajz = ajz.f158928q;
        }
        C58833ax.m90834k(accountId);
        C60870cx g = bVar.mo40051g(parcelableSyntheticTree, treeNodeRef, ajz);
        if (!z) {
            bjVar.mo101318b(intent, ajz2, z2);
        }
        C114410bb bbVar = C114410bb.f317231a;
        return C60922j.m93044g(g, C47810es.m84963c(bbVar), C60826bg.f164896a);
    }
}
