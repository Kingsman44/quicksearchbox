package com.google.android.apps.gsa.nga.shared.p6345h.p6347b;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6345h.C81237ab;
import com.google.android.apps.gsa.nga.shared.p6345h.C81239ad;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81243ah;
import com.google.android.apps.gsa.nga.shared.p6345h.C81277bh;
import com.google.android.apps.gsa.nga.shared.p6345h.C81280bk;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42881ag;
import com.google.android.libraries.storage.protostore.C42899ay;
import com.google.android.libraries.storage.protostore.C42901b;
import com.google.android.libraries.storage.protostore.C42907bc;
import com.google.android.libraries.storage.protostore.C42929by;
import com.google.android.libraries.storage.protostore.C42957cy;
import com.google.android.libraries.storage.protostore.C42959d;
import com.google.android.libraries.storage.protostore.C42979do;
import com.google.android.libraries.storage.protostore.C43006i;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.assistant.p3838ao.p3839a.p3845e.C49566bw;
import com.google.common.util.concurrent.C60888db;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.b.f */
/* compiled from: PG */
public final class C81268f {
    /* renamed from: a */
    public static Uri m129249a(Context context) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("NgaStartupPreferences.pb");
        return a.mo45820a();
    }

    /* renamed from: b */
    public static C42876ab m129250b(Context context, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("NgaEducationPreferences.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C81237ab.f222379B);
        ((C42901b) i).f112236b = C42907bc.f112261a;
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: c */
    public static C42876ab m129251c(Context context, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("NgaGboardPreferences.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C81239ad.f222408a);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: d */
    public static C42876ab m129252d(Context context, C43006i iVar, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("NgaInputPlatePreferences.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C81241af.f222410f);
        ((C42901b) i).f112236b = new C42959d(iVar);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: e */
    public static C42876ab m129253e(Context context, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("NgaLegalNotice.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C81243ah.f222417c);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: f */
    public static C42876ab m129254f(Uri uri, C42880af afVar) {
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(uri);
        i.mo45967d(C81277bh.f222481m);
        ((C42901b) i).f112236b = C42907bc.f112261a;
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: g */
    public static C42876ab m129255g(Context context, C43006i iVar, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("NgaUdcBits.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C81280bk.f222496l);
        ((C42901b) i).f112236b = new C42959d(iVar);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: h */
    public static C42876ab m129256h(Context context, C42880af afVar) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("nga");
        a.f111968c = "nga";
        a.mo45821b("OndeviceSuggestionsUserProfile.pb");
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C49566bw.f127897a);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: i */
    public static C42880af m129257i(C90851k kVar, C42813k kVar2) {
        C42932a aVar = C42932a.f112315a;
        HashMap hashMap = new HashMap();
        C60888db b = kVar.mo85209b("BlockingE-ProtoDataStore");
        C42881ag.m75749a(C42979do.f112413a, hashMap);
        C42881ag.m75749a(C42957cy.f112362a, hashMap);
        C42881ag.m75749a(C42929by.m75799k(), hashMap);
        C42881ag.m75749a(new C42899ay(C42979do.f112413a), hashMap);
        return new C42880af(b, kVar2, aVar, hashMap);
    }
}
