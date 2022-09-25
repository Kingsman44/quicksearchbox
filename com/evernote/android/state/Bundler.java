package com.evernote.android.state;

import android.os.Bundle;

/* compiled from: PG */
public interface Bundler {
    Object get(String str, Bundle bundle);

    void put(String str, Object obj, Bundle bundle);
}
