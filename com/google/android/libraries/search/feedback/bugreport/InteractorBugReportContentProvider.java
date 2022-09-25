package com.google.android.libraries.search.feedback.bugreport;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.inject.C47266f;
import com.google.apps.tiktok.p3633d.p3634a.C46674l;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
public final class InteractorBugReportContentProvider extends ContentProvider {

    /* renamed from: a */
    private static final C59071e f101497a = C59071e.m91332i("com.google.android.libraries.search.feedback.bugreport.InteractorBugReportContentProvider");

    /* renamed from: com.google.android.libraries.search.feedback.bugreport.InteractorBugReportContentProvider$a */
    /* compiled from: PG */
    public interface C38322a {
        /* renamed from: iW */
        Map mo41391iW();
    }

    /* renamed from: com.google.android.libraries.search.feedback.bugreport.InteractorBugReportContentProvider$b */
    /* compiled from: PG */
    public interface C38323b {
        /* renamed from: bT */
        C47770dh mo41392bT();

        /* renamed from: db */
        C46175b mo41393db();

        /* renamed from: dp */
        C46674l mo41394dp();

        /* renamed from: eK */
        Executor mo41395eK();

        /* renamed from: ez */
        Map mo41396ez();
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Unsupported!");
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Context context = getContext();
        context.getClass();
        C38323b bVar = (C38323b) C47266f.m84076a(context, C38323b.class);
        C47538ax c = bVar.mo41392bT().mo51613c("InteractorBugReportContentProvider#dump");
        try {
            Executor eK = bVar.mo41395eK();
            C46674l dp = bVar.mo41394dp();
            C47633f.m84733g(bVar.mo41393db().mo50247d()).mo51515h(new C38331h(this, bVar.mo41396ez()), eK).mo51516i(new C38332i(dp), eK).mo51515h(new C38333j(printWriter), eK).get(10, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace(printWriter);
            ((C59052c) ((C59052c) ((C59052c) f101497a.mo56226d()).mo56382g(e)).mo56372aa(53103)).mo56386p("Bug report dump failed.");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            if (c != null) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
        if (c != null) {
            c.close();
        }
    }

    public final String getType(Uri uri) {
        throw new UnsupportedOperationException("Unsupported!");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Unsupported!");
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Unsupported!");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Unsupported!");
    }
}
