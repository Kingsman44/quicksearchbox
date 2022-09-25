package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71003bc;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.p */
/* compiled from: PG */
public abstract class C125510p {
    /* renamed from: a */
    public abstract C125065at mo106995a();

    /* renamed from: b */
    public abstract C125065at mo106996b();

    /* renamed from: c */
    public abstract C125513s mo106997c();

    /* renamed from: d */
    public abstract C71003bc mo106998d();

    /* renamed from: e */
    public static C125510p m205497e(C125065at atVar, C125065at atVar2, C125513s sVar, C71003bc bcVar) {
        if (atVar == null) {
            throw new NullPointerException("Null textToCommit");
        } else if (atVar2 == null) {
            throw new NullPointerException("Null composingText");
        } else if (bcVar != null) {
            return new C125504j(atVar, atVar2, sVar, bcVar);
        } else {
            throw new NullPointerException("Null formattingLog");
        }
    }
}
