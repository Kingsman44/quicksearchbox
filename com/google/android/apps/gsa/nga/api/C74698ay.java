package com.google.android.apps.gsa.nga.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Parcel;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.nga.api.ay */
/* compiled from: PG */
public final class C74698ay extends C8848a implements C74701ba {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.api.ay.<init>(android.os.IBinder):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C74698ay(android.os.IBinder r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.api.ay.<init>(android.os.IBinder):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.api.C74698ay.<init>(android.os.IBinder):void");
    }

    /* renamed from: e */
    public final void mo71053e() {
        mo17262he(3, mo17260gA());
    }

    /* renamed from: f */
    public final void mo71054f(Configuration configuration) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, configuration);
        mo17262he(4, gA);
    }

    /* renamed from: g */
    public final void mo71055g(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(2, gA);
    }

    /* renamed from: h */
    public final void mo71056h(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(1, gA);
    }
}
