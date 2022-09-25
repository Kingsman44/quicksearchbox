package com.google.android.apps.gsa.nga.api;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.libraries.assistant.p1484g.p1502d.C18155ag;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* renamed from: com.google.android.apps.gsa.nga.api.x */
/* compiled from: PG */
public final class C74740x extends C8848a implements C74742z {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.api.x.<init>(android.os.IBinder):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C74740x(android.os.IBinder r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.api.x.<init>(android.os.IBinder):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.api.C74740x.<init>(android.os.IBinder):void");
    }

    /* renamed from: e */
    public final void mo71119e() {
        mo17263hf(6, mo17260gA());
    }

    /* renamed from: f */
    public final void mo71120f() {
        mo17263hf(5, mo17260gA());
    }

    /* renamed from: g */
    public final void mo71121g(int i) {
        Parcel gA = mo17260gA();
        gA.writeInt(i);
        mo17263hf(4, gA);
    }

    /* renamed from: h */
    public final void mo71122h(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, int i, C18155ag agVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        C8850c.m23497f(gA, assistStructure);
        C8850c.m23497f(gA, assistContent);
        gA.writeInt(i);
        C8850c.m23499h(gA, agVar);
        mo17263hf(2, gA);
    }

    /* renamed from: i */
    public final void mo71123i(Bitmap bitmap) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bitmap);
        mo17263hf(3, gA);
    }

    /* renamed from: j */
    public final void mo71124j(C74737q qVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, qVar);
        mo17263hf(7, gA);
    }

    /* renamed from: k */
    public final void mo71125k(Bundle bundle, int i) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        gA.writeInt(i);
        mo17263hf(1, gA);
    }
}
