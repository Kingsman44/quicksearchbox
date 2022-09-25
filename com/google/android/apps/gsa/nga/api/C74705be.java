package com.google.android.apps.gsa.nga.api;

import android.content.Intent;
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
/* renamed from: com.google.android.apps.gsa.nga.api.be */
/* compiled from: PG */
public final class C74705be extends C8848a implements C74707bg {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.api.be.<init>(android.os.IBinder):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C74705be(android.os.IBinder r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.api.be.<init>(android.os.IBinder):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.api.C74705be.<init>(android.os.IBinder):void");
    }

    /* renamed from: e */
    public final int mo71060e() {
        Parcel gT = mo17261gT(1, mo17260gA());
        int readInt = gT.readInt();
        gT.recycle();
        return readInt;
    }

    /* renamed from: f */
    public final void mo71061f() {
        mo17262he(3, mo17260gA());
    }

    /* renamed from: g */
    public final void mo71062g() {
        mo17262he(7, mo17260gA());
    }

    /* renamed from: h */
    public final void mo71063h() {
        mo17262he(6, mo17260gA());
    }

    /* renamed from: i */
    public final void mo71064i(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17262he(2, gA);
    }

    /* renamed from: j */
    public final void mo71065j(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(4, gA);
    }

    /* renamed from: k */
    public final void mo71066k(Intent intent) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, intent);
        mo17262he(5, gA);
    }
}
