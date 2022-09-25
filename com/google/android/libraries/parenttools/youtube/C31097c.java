package com.google.android.libraries.parenttools.youtube;

import android.util.Log;
import com.google.android.gms.tasks.C146021aq;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.parenttools.youtube.c */
/* compiled from: PG */
public final /* synthetic */ class C31097c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C31098d f83775a;

    /* renamed from: b */
    public final /* synthetic */ String f83776b;

    public /* synthetic */ C31097c(C31098d dVar, String str) {
        this.f83775a = dVar;
        this.f83776b = str;
    }

    public final void run() {
        C31098d dVar = this.f83775a;
        try {
            C146021aq.m237852f(dVar.f83778b.mo117810a(this.f83776b));
        } catch (InterruptedException | ExecutionException e) {
            Log.w("ParentToolsAuthTask", "Failed to clear auth token", e);
        }
    }
}
