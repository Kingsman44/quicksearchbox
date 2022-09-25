package com.google.android.apps.gsa.staticplugins.opa.audio;

import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.search.C90494d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.FileNotFoundException;

/* compiled from: PG */
public class OpaAudioProvider extends C90494d {

    /* renamed from: a */
    private static final String f299378a;

    static {
        String format = String.format("content://%s", new Object[]{"com.google.android.apps.gsa.staticplugins.opa.audio.OpaAudioProvider"});
        f299378a = format;
        Uri.parse(format);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final String getType(Uri uri) {
        return "audio";
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        C74507e.m120470f(9);
        if (C33259r.f88929b.equals(str)) {
            return ParcelFileDescriptor.adoptFd((int) ContentUris.parseId(uri));
        }
        throw new FileNotFoundException("Mode is not read.");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException();
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
